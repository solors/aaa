package com.taurusx.tax.p594e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ironsource.C21114v8;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p594e.C28363r0;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32180coo2iico;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;

/* renamed from: com.taurusx.tax.e.h0 */
/* loaded from: classes7.dex */
public class C28338h0 extends C28337h {

    /* renamed from: u */
    public static final String[] f73573u = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* renamed from: b */
    public C28363r0.EnumC28375l f73574b;

    /* renamed from: c */
    public final C28363r0.EnumC28366c f73575c;

    /* renamed from: d */
    public final C28363r0.EnumC28370g f73576d;

    /* renamed from: e */
    public C28363r0 f73577e;

    /* renamed from: f */
    public ViewGroup f73578f;

    /* renamed from: g */
    public Handler f73579g;

    /* renamed from: h */
    public final int f73580h;

    /* renamed from: i */
    public C28341c f73581i;

    /* renamed from: j */
    public ImageView f73582j;

    /* renamed from: k */
    public boolean f73583k;

    /* renamed from: l */
    public float f73584l;

    /* renamed from: m */
    public int f73585m;

    /* renamed from: n */
    public int f73586n;

    /* renamed from: o */
    public int f73587o;

    /* renamed from: p */
    public FrameLayout f73588p;

    /* renamed from: q */
    public FrameLayout f73589q;

    /* renamed from: r */
    public RelativeLayout f73590r;

    /* renamed from: s */
    public C28363r0 f73591s;

    /* renamed from: t */
    public C28335g f73592t;

    /* renamed from: com.taurusx.tax.e.h0$a */
    /* loaded from: classes7.dex */
    public class RunnableC28339a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f73593a;

        /* renamed from: b */
        public final /* synthetic */ String f73594b;

        public RunnableC28339a(File file, String str) {
            this.f73593a = file;
            this.f73594b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = this.f73593a;
            File file2 = new File(file, System.currentTimeMillis() + ".jpg");
            Bitmap bitmap = null;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f73594b).openConnection();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri fromFile = Uri.fromFile(file2);
                C28338h0 c28338h0 = C28338h0.this;
                c28338h0.f73579g.post(new RunnableC28336g0(c28338h0, "Download image Success..."));
                C28338h0.this.f73572a.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile));
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.taurusx.tax.e.h0$b */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC28340b implements View.OnClickListener {
        public View$OnClickListenerC28340b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C28338h0.this.m38235a();
        }
    }

    /* renamed from: com.taurusx.tax.e.h0$c */
    /* loaded from: classes7.dex */
    public class C28341c extends BroadcastReceiver {

        /* renamed from: a */
        public int f73597a;

        /* renamed from: b */
        public Context f73598b;

        public C28341c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            int orientation;
            if (this.f73598b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED") && (orientation = ((WindowManager) C28338h0.this.f73572a.getContext().getSystemService("window")).getDefaultDisplay().getOrientation()) != this.f73597a) {
                this.f73597a = orientation;
                C28338h0 c28338h0 = C28338h0.this;
                c28338h0.m38223g();
                c28338h0.f73572a.m38220a(new C28351m0(c28338h0.f73585m, c28338h0.f73586n));
            }
        }
    }

    public C28338h0(C28363r0 c28363r0, C28363r0.EnumC28366c enumC28366c, C28363r0.EnumC28370g enumC28370g) {
        super(c28363r0);
        this.f73574b = C28363r0.EnumC28375l.HIDDEN;
        this.f73579g = new Handler();
        this.f73581i = new C28341c();
        this.f73585m = -1;
        this.f73586n = -1;
        this.f73592t = new C28335g();
        this.f73591s = c28363r0;
        this.f73575c = enumC28366c;
        this.f73576d = enumC28370g;
        Context m38225e = m38225e();
        this.f73580h = m38225e instanceof Activity ? ((Activity) m38225e).getRequestedOrientation() : -1;
        this.f73589q = m38231b();
        this.f73590r = m38227c();
        this.f73588p = m38226d();
        m38224f();
    }

    /* renamed from: a */
    public void m38233a(Map<String, String> map) {
        Context context = this.f73572a.getContext();
        if (C28207b.m38432k(context)) {
            try {
                Map<String, Object> m38229b = m38229b(map);
                Intent type = new Intent("android.intent.action.INSERT").setType(C32180coo2iico.cii2c2);
                HashMap hashMap = (HashMap) m38229b;
                for (String str : hashMap.keySet()) {
                    Object obj = hashMap.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                context.startActivity(type);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.m37905d("MraidDisplayController", "no calendar app installed");
                this.f73572a.m38216a(EnumC28378t.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
                return;
            } catch (IllegalArgumentException e) {
                LogUtil.m37905d("MraidDisplayController", "create calendar: invalid parameters " + e.getMessage());
                this.f73572a.m38216a(EnumC28378t.CREATE_CALENDAR_EVENT, e.getMessage());
                return;
            } catch (Exception unused2) {
                LogUtil.m37905d("MraidDisplayController", "could not create calendar event");
                this.f73572a.m38216a(EnumC28378t.CREATE_CALENDAR_EVENT, "could not create calendar event");
                return;
            }
        }
        LogUtil.m37905d("MraidDisplayController", "unsupported action createCalendarEvent for devices pre-ICS");
        this.f73572a.m38216a(EnumC28378t.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
    }

    /* renamed from: b */
    public final void m38228b(boolean z) {
        int i;
        try {
            Activity activity = (Activity) this.f73572a.getContext();
            if (z) {
                i = activity.getResources().getConfiguration().orientation;
            } else {
                i = this.f73580h;
            }
            activity.setRequestedOrientation(i);
        } catch (ClassCastException unused) {
            LogUtil.m37905d("MraidDisplayController", "Unable to modify device orientation.");
        }
    }

    /* renamed from: c */
    public RelativeLayout m38227c() {
        return new RelativeLayout(this.f73572a.getContext());
    }

    /* renamed from: d */
    public FrameLayout m38226d() {
        return new FrameLayout(this.f73572a.getContext());
    }

    /* renamed from: e */
    public final Context m38225e() {
        return this.f73572a.getContext();
    }

    /* renamed from: f */
    public final void m38224f() {
        this.f73574b = C28363r0.EnumC28375l.LOADING;
        m38223g();
        C28341c c28341c = this.f73581i;
        Context context = this.f73572a.getContext();
        c28341c.f73598b = context;
        context.registerReceiver(c28341c, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
    }

    /* renamed from: g */
    public final void m38223g() {
        int i;
        int i2;
        Context context = this.f73572a.getContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f73584l = displayMetrics.density;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
            i2 = window.findViewById(16908290).getTop() - i;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = (displayMetrics.heightPixels - i) - i2;
        double d = 160.0d / displayMetrics.densityDpi;
        this.f73585m = (int) (i3 * d);
        this.f73586n = (int) (i4 * d);
    }

    /* renamed from: b */
    public final Map<String, Object> m38229b(Map<String, String> map) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date m38230b = m38230b(map.get("start"));
                if (m38230b != null) {
                    hashMap.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(m38230b.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date m38230b2 = m38230b(map.get("end"));
                        if (m38230b2 != null) {
                            hashMap.put("endTime", Long.valueOf(m38230b2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        hashMap.put(MRAIDNativeFeatureProvider.EVENT_LOCATION, map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        hashMap.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        hashMap.put("availability", Integer.valueOf(map.get("transparency").equals(C21114v8.C21122h.f54047T) ? 1 : 0));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = map.get("frequency");
                        int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb2.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb2.append("INTERVAL=" + parseInt + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb2.append("FREQ=WEEKLY;");
                                if (parseInt != -1) {
                                    sb2.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    StringBuilder sb3 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] split = map.get("daysInWeek").split(",");
                                    for (String str3 : split) {
                                        int parseInt2 = Integer.parseInt(str3);
                                        if (parseInt2 == 7) {
                                            parseInt2 = 0;
                                        }
                                        if (!zArr[parseInt2]) {
                                            StringBuilder sb4 = new StringBuilder();
                                            switch (parseInt2) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("invalid day of week " + parseInt2);
                                            }
                                            sb4.append(str);
                                            sb4.append(",");
                                            sb3.append(sb4.toString());
                                            zArr[parseInt2] = true;
                                        }
                                    }
                                    if (split.length != 0) {
                                        sb3.deleteCharAt(sb3.length() - 1);
                                        String sb5 = sb3.toString();
                                        if (sb5 == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb2.append("BYDAY=" + sb5 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb2.append("FREQ=MONTHLY;");
                                if (parseInt != -1) {
                                    sb2.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    StringBuilder sb6 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] split2 = map.get("daysInMonth").split(",");
                                    for (String str4 : split2) {
                                        int parseInt3 = Integer.parseInt(str4);
                                        int i = parseInt3 + 31;
                                        if (!zArr2[i]) {
                                            StringBuilder sb7 = new StringBuilder();
                                            if (parseInt3 != 0 && parseInt3 >= -31 && parseInt3 <= 31) {
                                                sb7.append("" + parseInt3);
                                                sb7.append(",");
                                                sb6.append(sb7.toString());
                                                zArr2[i] = true;
                                            } else {
                                                throw new IllegalArgumentException("invalid day of month " + parseInt3);
                                            }
                                        }
                                    }
                                    if (split2.length != 0) {
                                        sb6.deleteCharAt(sb6.length() - 1);
                                        String sb8 = sb6.toString();
                                        if (sb8 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb2.append("BYMONTHDAY=" + sb8 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    hashMap.put("rrule", sb2.toString());
                    return hashMap;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    /* renamed from: a */
    public void m38235a() {
        C28363r0.EnumC28375l enumC28375l = this.f73574b;
        if (enumC28375l == C28363r0.EnumC28375l.EXPANDED) {
            m38232a(false);
            this.f73589q.removeAllViewsInLayout();
            this.f73590r.removeAllViewsInLayout();
            this.f73578f.removeView(this.f73590r);
            this.f73572a.requestLayout();
            ViewGroup viewGroup = (ViewGroup) this.f73588p.getParent();
            viewGroup.addView(this.f73572a, this.f73587o);
            viewGroup.removeView(this.f73588p);
            viewGroup.invalidate();
            m38228b(false);
            C28363r0.EnumC28375l enumC28375l2 = C28363r0.EnumC28375l.DEFAULT;
            this.f73574b = enumC28375l2;
            this.f73572a.m38220a(new C28353n0(enumC28375l2));
        } else if (enumC28375l == C28363r0.EnumC28375l.RESIZED) {
            ViewGroup viewGroup2 = (ViewGroup) this.f73591s.getParent();
            this.f73572a.m38212c();
            C28363r0 c28363r0 = this.f73572a;
            int width = c28363r0.f73631l.width();
            int height = c28363r0.f73631l.height();
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = height;
            viewGroup2.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = c28363r0.getLayoutParams();
            layoutParams2.width = width;
            layoutParams2.height = height;
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
            } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).addRule(13);
            } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
            }
            c28363r0.setLayoutParams(layoutParams2);
            m38228b(false);
            C28363r0.EnumC28375l enumC28375l3 = C28363r0.EnumC28375l.DEFAULT;
            this.f73574b = enumC28375l3;
            this.f73572a.m38220a(new C28353n0(enumC28375l3));
        } else if (enumC28375l == C28363r0.EnumC28375l.DEFAULT) {
            this.f73572a.setVisibility(4);
            C28363r0.EnumC28375l enumC28375l4 = C28363r0.EnumC28375l.HIDDEN;
            this.f73574b = enumC28375l4;
            this.f73572a.m38220a(new C28353n0(enumC28375l4));
        }
        if (this.f73572a.getMraidListener() != null) {
            ((C28334f0) this.f73572a.getMraidListener()).f73564a.m38235a();
        }
    }

    /* renamed from: b */
    public final Date m38230b(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = f73573u;
            if (i >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i]).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i++;
        }
        return date;
    }

    /* renamed from: a */
    public void m38232a(boolean z) {
        if (this.f73578f == null) {
            return;
        }
        if (z) {
            if (this.f73582j == null) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{-16842919}, EnumC28333f.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(this.f73578f.getContext()));
                stateListDrawable.addState(new int[]{16842919}, EnumC28333f.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(this.f73578f.getContext()));
                ImageButton imageButton = new ImageButton(this.f73572a.getContext());
                this.f73582j = imageButton;
                imageButton.setImageDrawable(stateListDrawable);
                this.f73582j.setBackgroundDrawable(null);
                this.f73582j.setOnClickListener(new View$OnClickListenerC28340b());
            }
            int i = (int) ((this.f73584l * 50.0f) + 0.5f);
            this.f73589q.addView(this.f73582j, new FrameLayout.LayoutParams(i, i, 5));
        } else {
            this.f73589q.removeView(this.f73582j);
        }
        C28363r0 c28363r0 = this.f73572a;
        if (c28363r0.getOnCloseButtonStateChangeListener() != null) {
            c28363r0.getOnCloseButtonStateChangeListener().m38211a(c28363r0, z);
        }
    }

    /* renamed from: b */
    public FrameLayout m38231b() {
        return new FrameLayout(this.f73572a.getContext());
    }

    /* renamed from: a */
    public final void m38234a(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
        file.mkdirs();
        new Thread(new RunnableC28339a(file, str)).start();
    }
}
