package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* loaded from: classes2.dex */
public class WebResourceService implements Runnable {
    private static final String LOG_TAG = "WebResourceService";
    private static final long REFRESH_INTERVAL = 86400000;
    private static final String WEB_DIR = "/mdtb_web/";
    private static boolean inProgress = false;
    private static WebResourceService theService;

    private void createWebDirIfNeeded() {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR);
        if (file.isDirectory() || file.exists()) {
            return;
        }
        file.mkdir();
    }

    public static WebResourceService getInstance() {
        if (theService == null) {
            theService = new WebResourceService();
        }
        return theService;
    }

    public static void init() {
        try {
            if (inProgress) {
                return;
            }
            WebResourceService webResourceService = getInstance();
            Long webResoucesLastPing = DtbSharedPreferences.getInstance().getWebResoucesLastPing();
            if (webResoucesLastPing == null || new Date().getTime() - webResoucesLastPing.longValue() > 86400000) {
                inProgress = true;
                DtbThreadService.getInstance().execute(webResourceService);
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute init method", e);
        }
    }

    private synchronized void renameTo(File file, File file2) {
        file.renameTo(file2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void deleteWebDirContent() {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR);
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
    }

    public synchronized String loadFile(String str) throws IOException {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR + str + ".js");
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                fileInputStream.close();
                return sb2.toString();
            }
            sb2.append(readLine.trim());
            sb2.append("\n");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] cDNResources;
        DtbHttpClient dtbHttpClient;
        File filesDir;
        try {
            createWebDirIfNeeded();
            boolean z = true;
            for (String str : WebResourceOptions.getCDNResources()) {
                try {
                    dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost(str) + str);
                    dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                    dtbHttpClient.executeGET(60000);
                } catch (Exception e) {
                    DtbLog.error("Error registering device for ads:" + e);
                    z = false;
                }
                if (dtbHttpClient.getResponseCode() == 200) {
                    String response = dtbHttpClient.getResponse();
                    File createTempFile = File.createTempFile("dtb-temp", "js", AdRegistration.getContext().getFilesDir());
                    FileWriter fileWriter = new FileWriter(createTempFile);
                    fileWriter.write(response);
                    fileWriter.close();
                    renameTo(createTempFile, new File(filesDir.getAbsolutePath() + WEB_DIR + str));
                } else {
                    throw new RuntimeException("resource " + str + " not available");
                    break;
                }
            }
            if (z) {
                DtbSharedPreferences.getInstance().saveWebResoucesLastPing(new Date().getTime());
            }
            inProgress = false;
        } catch (RuntimeException e2) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute init method", e2);
        }
    }
}
