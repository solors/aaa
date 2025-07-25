package com.google.android.exoplayer2.p380ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.session.MediaSessionCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.media.app.NotificationCompat;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager */
/* loaded from: classes4.dex */
public class PlayerNotificationManager {
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";

    /* renamed from: O */
    private static int f35348O;

    /* renamed from: A */
    private boolean f35349A;

    /* renamed from: B */
    private boolean f35350B;

    /* renamed from: C */
    private boolean f35351C;

    /* renamed from: D */
    private boolean f35352D;

    /* renamed from: E */
    private boolean f35353E;

    /* renamed from: F */
    private int f35354F;

    /* renamed from: G */
    private boolean f35355G;

    /* renamed from: H */
    private int f35356H;

    /* renamed from: I */
    private int f35357I;
    @DrawableRes

    /* renamed from: J */
    private int f35358J;

    /* renamed from: K */
    private int f35359K;

    /* renamed from: L */
    private int f35360L;

    /* renamed from: M */
    private boolean f35361M;
    @Nullable

    /* renamed from: N */
    private String f35362N;

    /* renamed from: a */
    private final Context f35363a;

    /* renamed from: b */
    private final String f35364b;

    /* renamed from: c */
    private final int f35365c;

    /* renamed from: d */
    private final MediaDescriptionAdapter f35366d;
    @Nullable

    /* renamed from: e */
    private final NotificationListener f35367e;
    @Nullable

    /* renamed from: f */
    private final CustomActionReceiver f35368f;

    /* renamed from: g */
    private final Handler f35369g;

    /* renamed from: h */
    private final NotificationManagerCompat f35370h;

    /* renamed from: i */
    private final IntentFilter f35371i;

    /* renamed from: j */
    private final Player.Listener f35372j;

    /* renamed from: k */
    private final NotificationBroadcastReceiver f35373k;

    /* renamed from: l */
    private final Map<String, NotificationCompat.Action> f35374l;

    /* renamed from: m */
    private final Map<String, NotificationCompat.Action> f35375m;

    /* renamed from: n */
    private final PendingIntent f35376n;

    /* renamed from: o */
    private final int f35377o;
    @Nullable

    /* renamed from: p */
    private NotificationCompat.Builder f35378p;
    @Nullable

    /* renamed from: q */
    private List<NotificationCompat.Action> f35379q;
    @Nullable

    /* renamed from: r */
    private Player f35380r;

    /* renamed from: s */
    private boolean f35381s;

    /* renamed from: t */
    private int f35382t;
    @Nullable

    /* renamed from: u */
    private MediaSessionCompat.Token f35383u;

    /* renamed from: v */
    private boolean f35384v;

    /* renamed from: w */
    private boolean f35385w;

    /* renamed from: x */
    private boolean f35386x;

    /* renamed from: y */
    private boolean f35387y;

    /* renamed from: z */
    private boolean f35388z;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$BitmapCallback */
    /* loaded from: classes4.dex */
    public final class BitmapCallback {

        /* renamed from: a */
        private final int f35389a;

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.m73076r(bitmap, this.f35389a);
            }
        }

        private BitmapCallback(int i) {
            PlayerNotificationManager.this = r1;
            this.f35389a = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver */
    /* loaded from: classes4.dex */
    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter */
    /* loaded from: classes4.dex */
    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @Nullable
        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver */
    /* loaded from: classes4.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
            PlayerNotificationManager.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.f35380r;
            if (player != null && PlayerNotificationManager.this.f35381s && intent.getIntExtra("INSTANCE_ID", PlayerNotificationManager.this.f35377o) == PlayerNotificationManager.this.f35377o) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (player.getPlaybackState() == 1) {
                        player.prepare();
                    } else if (player.getPlaybackState() == 4) {
                        player.seekToDefaultPosition(player.getCurrentMediaItemIndex());
                    }
                    player.play();
                } else if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    player.pause();
                } else if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    player.seekToPrevious();
                } else if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    player.seekBack();
                } else if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    player.seekForward();
                } else if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    player.seekToNext();
                } else if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    player.stop(true);
                } else if ("com.google.android.exoplayer.dismiss".equals(action)) {
                    PlayerNotificationManager.this.m73072v(true);
                } else if (action != null && PlayerNotificationManager.this.f35368f != null && PlayerNotificationManager.this.f35375m.containsKey(action)) {
                    PlayerNotificationManager.this.f35368f.onCustomAction(player, action, intent);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$PlayerListener */
    /* loaded from: classes4.dex */
    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
            PlayerNotificationManager.this = r1;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.m73077q();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Priority */
    /* loaded from: classes4.dex */
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Visibility */
    /* loaded from: classes4.dex */
    public @interface Visibility {
    }

    protected PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @Nullable String str2) {
        Map<String, NotificationCompat.Action> emptyMap;
        Context applicationContext = context.getApplicationContext();
        this.f35363a = applicationContext;
        this.f35364b = str;
        this.f35365c = i;
        this.f35366d = mediaDescriptionAdapter;
        this.f35367e = notificationListener;
        this.f35368f = customActionReceiver;
        this.f35358J = i2;
        this.f35362N = str2;
        int i10 = f35348O;
        f35348O = i10 + 1;
        this.f35377o = i10;
        this.f35369g = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.e
            {
                PlayerNotificationManager.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m73078p;
                m73078p = PlayerNotificationManager.this.m73078p(message);
                return m73078p;
            }
        });
        this.f35370h = NotificationManagerCompat.from(applicationContext);
        this.f35372j = new PlayerListener();
        this.f35373k = new NotificationBroadcastReceiver();
        this.f35371i = new IntentFilter();
        this.f35384v = true;
        this.f35385w = true;
        this.f35352D = true;
        this.f35388z = true;
        this.f35349A = true;
        this.f35355G = true;
        this.f35361M = true;
        this.f35357I = 0;
        this.f35356H = 0;
        this.f35360L = -1;
        this.f35354F = 1;
        this.f35359K = 1;
        Map<String, NotificationCompat.Action> m73082l = m73082l(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.f35374l = m73082l;
        for (String str3 : m73082l.keySet()) {
            this.f35371i.addAction(str3);
        }
        if (customActionReceiver != null) {
            emptyMap = customActionReceiver.createCustomActions(applicationContext, this.f35377o);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f35375m = emptyMap;
        for (String str4 : emptyMap.keySet()) {
            this.f35371i.addAction(str4);
        }
        this.f35376n = m73084j("com.google.android.exoplayer.dismiss", applicationContext, this.f35377o);
        this.f35371i.addAction("com.google.android.exoplayer.dismiss");
    }

    /* renamed from: j */
    private static PendingIntent m73084j(String str, Context context, int i) {
        int i2;
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i);
        if (Util.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }

    /* renamed from: l */
    private static Map<String, NotificationCompat.Action> m73082l(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new NotificationCompat.Action(i2, context.getString(C16096R.C16103string.exo_controls_play_description), m73084j(ACTION_PLAY, context, i)));
        hashMap.put(ACTION_PAUSE, new NotificationCompat.Action(i3, context.getString(C16096R.C16103string.exo_controls_pause_description), m73084j(ACTION_PAUSE, context, i)));
        hashMap.put(ACTION_STOP, new NotificationCompat.Action(i4, context.getString(C16096R.C16103string.exo_controls_stop_description), m73084j(ACTION_STOP, context, i)));
        hashMap.put(ACTION_REWIND, new NotificationCompat.Action(i5, context.getString(C16096R.C16103string.exo_controls_rewind_description), m73084j(ACTION_REWIND, context, i)));
        hashMap.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(i6, context.getString(C16096R.C16103string.exo_controls_fastforward_description), m73084j(ACTION_FAST_FORWARD, context, i)));
        hashMap.put(ACTION_PREVIOUS, new NotificationCompat.Action(i7, context.getString(C16096R.C16103string.exo_controls_previous_description), m73084j(ACTION_PREVIOUS, context, i)));
        hashMap.put(ACTION_NEXT, new NotificationCompat.Action(i8, context.getString(C16096R.C16103string.exo_controls_next_description), m73084j(ACTION_NEXT, context, i)));
        return hashMap;
    }

    /* renamed from: p */
    public boolean m73078p(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            Player player = this.f35380r;
            if (player != null && this.f35381s && this.f35382t == message.arg1) {
                m73073u(player, (Bitmap) message.obj);
            }
        } else {
            Player player2 = this.f35380r;
            if (player2 != null) {
                m73073u(player2, null);
            }
        }
        return true;
    }

    /* renamed from: q */
    public void m73077q() {
        if (!this.f35369g.hasMessages(0)) {
            this.f35369g.sendEmptyMessage(0);
        }
    }

    /* renamed from: r */
    public void m73076r(Bitmap bitmap, int i) {
        this.f35369g.obtainMessage(1, i, -1, bitmap).sendToTarget();
    }

    /* renamed from: s */
    private static void m73075s(NotificationCompat.Builder builder, @Nullable Bitmap bitmap) {
        builder.setLargeIcon(bitmap);
    }

    /* renamed from: t */
    private boolean m73074t(Player player) {
        if (player.getPlaybackState() != 4 && player.getPlaybackState() != 1 && player.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m73073u(Player player, @Nullable Bitmap bitmap) {
        boolean m73079o = m73079o(player);
        NotificationCompat.Builder m73083k = m73083k(player, this.f35378p, m73079o, bitmap);
        this.f35378p = m73083k;
        boolean z = false;
        if (m73083k == null) {
            m73072v(false);
            return;
        }
        Notification build = m73083k.build();
        this.f35370h.notify(this.f35365c, build);
        if (!this.f35381s) {
            this.f35363a.registerReceiver(this.f35373k, this.f35371i);
        }
        NotificationListener notificationListener = this.f35367e;
        if (notificationListener != null) {
            int i = this.f35365c;
            if (m73079o || !this.f35381s) {
                z = true;
            }
            notificationListener.onNotificationPosted(i, build, z);
        }
        this.f35381s = true;
    }

    /* renamed from: v */
    public void m73072v(boolean z) {
        if (this.f35381s) {
            this.f35381s = false;
            this.f35369g.removeMessages(0);
            this.f35370h.cancel(this.f35365c);
            this.f35363a.unregisterReceiver(this.f35373k);
            NotificationListener notificationListener = this.f35367e;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.f35365c, z);
            }
        }
    }

    public final void invalidate() {
        if (this.f35381s) {
            m73077q();
        }
    }

    @Nullable
    /* renamed from: k */
    protected NotificationCompat.Builder m73083k(Player player, @Nullable NotificationCompat.Builder builder, boolean z, @Nullable Bitmap bitmap) {
        NotificationCompat.Action action;
        if (player.getPlaybackState() == 1 && player.getCurrentTimeline().isEmpty()) {
            this.f35379q = null;
            return null;
        }
        List<String> m73080n = m73080n(player);
        ArrayList arrayList = new ArrayList(m73080n.size());
        for (int i = 0; i < m73080n.size(); i++) {
            String str = m73080n.get(i);
            if (this.f35374l.containsKey(str)) {
                action = this.f35374l.get(str);
            } else {
                action = this.f35375m.get(str);
            }
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.f35379q)) {
            builder = new NotificationCompat.Builder(this.f35363a, this.f35364b);
            this.f35379q = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                builder.addAction((NotificationCompat.Action) arrayList.get(i2));
            }
        }
        NotificationCompat.MediaStyle mediaStyle = new NotificationCompat.MediaStyle();
        MediaSessionCompat.Token token = this.f35383u;
        if (token != null) {
            mediaStyle.setMediaSession(token);
        }
        mediaStyle.setShowActionsInCompactView(m73081m(m73080n, player));
        mediaStyle.setShowCancelButton(!z);
        mediaStyle.setCancelButtonIntent(this.f35376n);
        builder.setStyle(mediaStyle);
        builder.setDeleteIntent(this.f35376n);
        builder.setBadgeIconType(this.f35354F).setOngoing(z).setColor(this.f35357I).setColorized(this.f35355G).setSmallIcon(this.f35358J).setVisibility(this.f35359K).setPriority(this.f35360L).setDefaults(this.f35356H);
        if (Util.SDK_INT >= 21 && this.f35361M && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        } else {
            builder.setShowWhen(false).setUsesChronometer(false);
        }
        builder.setContentTitle(this.f35366d.getCurrentContentTitle(player));
        builder.setContentText(this.f35366d.getCurrentContentText(player));
        builder.setSubText(this.f35366d.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.f35366d;
            int i3 = this.f35382t + 1;
            this.f35382t = i3;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i3));
        }
        m73075s(builder, bitmap);
        builder.setContentIntent(this.f35366d.createCurrentContentIntent(player));
        String str2 = this.f35362N;
        if (str2 != null) {
            builder.setGroup(str2);
        }
        builder.setOnlyAlertOnce(true);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int[] m73081m(java.util.List<java.lang.String> r7, com.google.android.exoplayer2.Player r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.f35386x
            r3 = -1
            if (r2 == 0) goto L18
            java.lang.String r2 = "com.google.android.exoplayer.prev"
            int r2 = r7.indexOf(r2)
            goto L24
        L18:
            boolean r2 = r6.f35350B
            if (r2 == 0) goto L23
            java.lang.String r2 = "com.google.android.exoplayer.rewind"
            int r2 = r7.indexOf(r2)
            goto L24
        L23:
            r2 = r3
        L24:
            boolean r4 = r6.f35387y
            if (r4 == 0) goto L2f
            java.lang.String r4 = "com.google.android.exoplayer.next"
            int r7 = r7.indexOf(r4)
            goto L3b
        L2f:
            boolean r4 = r6.f35351C
            if (r4 == 0) goto L3a
            java.lang.String r4 = "com.google.android.exoplayer.ffwd"
            int r7 = r7.indexOf(r4)
            goto L3b
        L3a:
            r7 = r3
        L3b:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L44
            r4[r5] = r2
            r5 = 1
        L44:
            boolean r8 = r6.m73074t(r8)
            if (r0 == r3) goto L52
            if (r8 == 0) goto L52
            int r8 = r5 + 1
            r4[r5] = r0
        L50:
            r5 = r8
            goto L5b
        L52:
            if (r1 == r3) goto L5b
            if (r8 != 0) goto L5b
            int r8 = r5 + 1
            r4[r5] = r1
            goto L50
        L5b:
            if (r7 == r3) goto L62
            int r8 = r5 + 1
            r4[r5] = r7
            r5 = r8
        L62:
            int[] r7 = java.util.Arrays.copyOf(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p380ui.PlayerNotificationManager.m73081m(java.util.List, com.google.android.exoplayer2.Player):int[]");
    }

    /* renamed from: n */
    protected List<String> m73080n(Player player) {
        boolean isCommandAvailable = player.isCommandAvailable(7);
        boolean isCommandAvailable2 = player.isCommandAvailable(11);
        boolean isCommandAvailable3 = player.isCommandAvailable(12);
        boolean isCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.f35384v && isCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.f35388z && isCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.f35352D) {
            if (m73074t(player)) {
                arrayList.add(ACTION_PAUSE);
            } else {
                arrayList.add(ACTION_PLAY);
            }
        }
        if (this.f35349A && isCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.f35385w && isCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.f35368f;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.f35353E) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    /* renamed from: o */
    protected boolean m73079o(Player player) {
        int playbackState = player.getPlaybackState();
        if ((playbackState == 2 || playbackState == 3) && player.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    public final void setBadgeIconType(int i) {
        if (this.f35354F == i) {
            return;
        }
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.f35354F = i;
        invalidate();
    }

    public final void setColor(int i) {
        if (this.f35357I != i) {
            this.f35357I = i;
            invalidate();
        }
    }

    public final void setColorized(boolean z) {
        if (this.f35355G != z) {
            this.f35355G = z;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.f35356H != i) {
            this.f35356H = i;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (!Util.areEqual(this.f35383u, token)) {
            this.f35383u = token;
            invalidate();
        }
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        Player player2 = this.f35380r;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.f35372j);
            if (player == null) {
                m73072v(false);
            }
        }
        this.f35380r = player;
        if (player != null) {
            player.addListener(this.f35372j);
            m73077q();
        }
    }

    public final void setPriority(int i) {
        if (this.f35360L == i) {
            return;
        }
        if (i != -2 && i != -1 && i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        this.f35360L = i;
        invalidate();
    }

    public final void setSmallIcon(@DrawableRes int i) {
        if (this.f35358J != i) {
            this.f35358J = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.f35361M != z) {
            this.f35361M = z;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z) {
        if (this.f35349A != z) {
            this.f35349A = z;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
        if (this.f35351C != z) {
            this.f35351C = z;
            if (z) {
                this.f35387y = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z) {
        if (this.f35385w != z) {
            this.f35385w = z;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z) {
        if (this.f35387y != z) {
            this.f35387y = z;
            if (z) {
                this.f35351C = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.f35352D != z) {
            this.f35352D = z;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z) {
        if (this.f35384v != z) {
            this.f35384v = z;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
        if (this.f35386x != z) {
            this.f35386x = z;
            if (z) {
                this.f35350B = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z) {
        if (this.f35388z != z) {
            this.f35388z = z;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z) {
        if (this.f35350B != z) {
            this.f35350B = z;
            if (z) {
                this.f35386x = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.f35353E == z) {
            return;
        }
        this.f35353E = z;
        invalidate();
    }

    public final void setVisibility(int i) {
        if (this.f35359K == i) {
            return;
        }
        if (i != -1 && i != 0 && i != 1) {
            throw new IllegalStateException();
        }
        this.f35359K = i;
        invalidate();
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        protected final Context f35391a;

        /* renamed from: b */
        protected final int f35392b;

        /* renamed from: c */
        protected final String f35393c;
        @Nullable

        /* renamed from: d */
        protected NotificationListener f35394d;
        @Nullable

        /* renamed from: e */
        protected CustomActionReceiver f35395e;

        /* renamed from: f */
        protected MediaDescriptionAdapter f35396f;

        /* renamed from: g */
        protected int f35397g;

        /* renamed from: h */
        protected int f35398h;

        /* renamed from: i */
        protected int f35399i;

        /* renamed from: j */
        protected int f35400j;

        /* renamed from: k */
        protected int f35401k;

        /* renamed from: l */
        protected int f35402l;

        /* renamed from: m */
        protected int f35403m;

        /* renamed from: n */
        protected int f35404n;

        /* renamed from: o */
        protected int f35405o;

        /* renamed from: p */
        protected int f35406p;

        /* renamed from: q */
        protected int f35407q;
        @Nullable

        /* renamed from: r */
        protected String f35408r;

        @Deprecated
        public Builder(Context context, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i, str);
            this.f35396f = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i = this.f35397g;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.f35391a, this.f35393c, i, this.f35398h, this.f35399i);
            }
            return new PlayerNotificationManager(this.f35391a, this.f35393c, this.f35392b, this.f35396f, this.f35394d, this.f35395e, this.f35400j, this.f35402l, this.f35403m, this.f35404n, this.f35401k, this.f35405o, this.f35406p, this.f35407q, this.f35408r);
        }

        public Builder setChannelDescriptionResourceId(int i) {
            this.f35398h = i;
            return this;
        }

        public Builder setChannelImportance(int i) {
            this.f35399i = i;
            return this;
        }

        public Builder setChannelNameResourceId(int i) {
            this.f35397g = i;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.f35395e = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i) {
            this.f35405o = i;
            return this;
        }

        public Builder setGroup(String str) {
            this.f35408r = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.f35396f = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i) {
            this.f35407q = i;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.f35394d = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i) {
            this.f35403m = i;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i) {
            this.f35402l = i;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i) {
            this.f35406p = i;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i) {
            this.f35401k = i;
            return this;
        }

        public Builder setSmallIconResourceId(int i) {
            this.f35400j = i;
            return this;
        }

        public Builder setStopActionIconResourceId(int i) {
            this.f35404n = i;
            return this;
        }

        public Builder(Context context, @IntRange(from = 1) int i, String str) {
            Assertions.checkArgument(i > 0);
            this.f35391a = context;
            this.f35392b = i;
            this.f35393c = str;
            this.f35399i = 2;
            this.f35396f = new DefaultMediaDescriptionAdapter(null);
            this.f35400j = C16096R.C16099drawable.exo_notification_small_icon;
            this.f35402l = C16096R.C16099drawable.exo_notification_play;
            this.f35403m = C16096R.C16099drawable.exo_notification_pause;
            this.f35404n = C16096R.C16099drawable.exo_notification_stop;
            this.f35401k = C16096R.C16099drawable.exo_notification_rewind;
            this.f35405o = C16096R.C16099drawable.exo_notification_fastforward;
            this.f35406p = C16096R.C16099drawable.exo_notification_previous;
            this.f35407q = C16096R.C16099drawable.exo_notification_next;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener */
    /* loaded from: classes4.dex */
    public interface NotificationListener {
        default void onNotificationCancelled(int i, boolean z) {
        }

        default void onNotificationPosted(int i, Notification notification, boolean z) {
        }
    }
}
