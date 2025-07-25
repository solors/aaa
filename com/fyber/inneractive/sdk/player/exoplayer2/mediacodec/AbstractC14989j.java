package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j */
/* loaded from: classes4.dex */
public abstract class AbstractC14989j {

    /* renamed from: a */
    public static final Pattern f29408a;

    /* renamed from: b */
    public static final HashMap f29409b;

    /* renamed from: c */
    public static final SparseIntArray f29410c;

    /* renamed from: d */
    public static final SparseIntArray f29411d;

    /* renamed from: e */
    public static final HashMap f29412e;

    /* renamed from: f */
    public static int f29413f;

    static {
        new C14980a("OMX.google.raw.decoder", null, null, false);
        f29408a = Pattern.compile("^\\D?(\\d+)$");
        f29409b = new HashMap();
        f29413f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29410c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f29411d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f29412e = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    public static C14980a m77332a(boolean z, String str) {
        List list;
        synchronized (AbstractC14989j.class) {
            C14984e c14984e = new C14984e(z, str);
            list = (List) f29409b.get(c14984e);
            if (list == null) {
                int i = AbstractC15133z.f29832a;
                ArrayList m77333a = m77333a(c14984e, i >= 21 ? new C14988i(z) : new C14987h());
                if (z && m77333a.isEmpty() && 21 <= i && i <= 23) {
                    m77333a = m77333a(c14984e, new C14987h());
                    if (!m77333a.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C14980a) m77333a.get(0)).f29364a);
                    }
                }
                if (i < 26) {
                    int i2 = 1;
                    if (m77333a.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((C14980a) m77333a.get(0)).f29364a)) {
                        while (true) {
                            if (i2 >= m77333a.size()) {
                                break;
                            }
                            C14980a c14980a = (C14980a) m77333a.get(i2);
                            if ("OMX.google.raw.decoder".equals(c14980a.f29364a)) {
                                m77333a.remove(i2);
                                m77333a.add(0, c14980a);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                list = Collections.unmodifiableList(m77333a);
                f29409b.put(c14984e, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (C14980a) list.get(0);
    }

    /* renamed from: a */
    public static int m77335a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f29413f == -1) {
            int i2 = 0;
            C14980a m77332a = m77332a(false, "video/avc");
            if (m77332a != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = m77332a.f29368e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, AbstractC15133z.f29832a >= 21 ? 345600 : 172800);
            }
            f29413f = i2;
        }
        return f29413f;
    }

    /* renamed from: a */
    public static ArrayList m77333a(C14984e c14984e, InterfaceC14986g interfaceC14986g) {
        boolean z;
        InterfaceC14986g interfaceC14986g2 = interfaceC14986g;
        try {
            ArrayList arrayList = new ArrayList();
            String str = c14984e.f29404a;
            int mo77339a = interfaceC14986g.mo77339a();
            boolean mo77336b = interfaceC14986g.mo77336b();
            int i = 0;
            while (i < mo77339a) {
                MediaCodecInfo mo77338a = interfaceC14986g2.mo77338a(i);
                String name = mo77338a.getName();
                if (m77334a(mo77338a, name, mo77336b)) {
                    String[] supportedTypes = mo77338a.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mo77338a.getCapabilitiesForType(str2);
                                boolean mo77337a = interfaceC14986g2.mo77337a(str, capabilitiesForType);
                                if (AbstractC15133z.f29832a <= 22) {
                                    String str3 = AbstractC15133z.f29835d;
                                    if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                        z = true;
                                        if ((!mo77336b && c14984e.f29405b == mo77337a) || (!mo77336b && !c14984e.f29405b)) {
                                            arrayList.add(new C14980a(name, str, capabilitiesForType, z));
                                        } else if (!mo77336b && mo77337a) {
                                            arrayList.add(new C14980a(name + ".secure", str, capabilitiesForType, z));
                                            return arrayList;
                                        }
                                    }
                                }
                                z = false;
                                if (!mo77336b) {
                                }
                                if (!mo77336b) {
                                    arrayList.add(new C14980a(name + ".secure", str, capabilitiesForType, z));
                                    return arrayList;
                                }
                                continue;
                            } catch (Exception e) {
                                if (AbstractC15133z.f29832a <= 23 && !arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                } else {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e;
                                }
                            }
                        }
                        i2++;
                        interfaceC14986g2 = interfaceC14986g;
                    }
                    continue;
                }
                i++;
                interfaceC14986g2 = interfaceC14986g;
            }
            return arrayList;
        } catch (Exception e2) {
            throw new C14985f(e2);
        }
    }

    /* renamed from: a */
    public static boolean m77334a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC15133z.f29832a;
        if (i >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i >= 18 || !"OMX.SEC.MP3.Decoder".equals(str)) {
                if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(AbstractC15133z.f29833b)) {
                    return false;
                }
                if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                    String str2 = AbstractC15133z.f29833b;
                    if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                        return false;
                    }
                }
                if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                    String str3 = AbstractC15133z.f29833b;
                    if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                        return false;
                    }
                }
                if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC15133z.f29834c)) {
                    String str4 = AbstractC15133z.f29833b;
                    if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                        return false;
                    }
                }
                return (i <= 19 && AbstractC15133z.f29833b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
            }
            return false;
        }
        return false;
    }
}
