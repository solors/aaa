package com.google.android.exoplayer2.p380ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.p380ui.StyledPlayerControlView;
import com.google.android.exoplayer2.p380ui.TimeBar;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView */
/* loaded from: classes4.dex */
public class StyledPlayerControlView extends FrameLayout {

    /* renamed from: A0 */
    private static final float[] f35445A0;
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    @Nullable

    /* renamed from: A */
    private final ImageView f35446A;
    @Nullable

    /* renamed from: B */
    private final View f35447B;
    @Nullable

    /* renamed from: C */
    private final View f35448C;
    @Nullable

    /* renamed from: D */
    private final View f35449D;
    @Nullable

    /* renamed from: E */
    private final TextView f35450E;
    @Nullable

    /* renamed from: F */
    private final TextView f35451F;
    @Nullable

    /* renamed from: G */
    private final TimeBar f35452G;

    /* renamed from: H */
    private final StringBuilder f35453H;

    /* renamed from: I */
    private final Formatter f35454I;

    /* renamed from: J */
    private final Timeline.Period f35455J;

    /* renamed from: K */
    private final Timeline.Window f35456K;

    /* renamed from: L */
    private final Runnable f35457L;

    /* renamed from: M */
    private final Drawable f35458M;

    /* renamed from: N */
    private final Drawable f35459N;

    /* renamed from: O */
    private final Drawable f35460O;

    /* renamed from: P */
    private final String f35461P;

    /* renamed from: Q */
    private final String f35462Q;

    /* renamed from: R */
    private final String f35463R;

    /* renamed from: S */
    private final Drawable f35464S;

    /* renamed from: T */
    private final Drawable f35465T;

    /* renamed from: U */
    private final float f35466U;

    /* renamed from: V */
    private final float f35467V;

    /* renamed from: W */
    private final String f35468W;

    /* renamed from: a0 */
    private final String f35469a0;

    /* renamed from: b */
    private final StyledPlayerControlViewLayoutManager f35470b;

    /* renamed from: b0 */
    private final Drawable f35471b0;

    /* renamed from: c */
    private final Resources f35472c;

    /* renamed from: c0 */
    private final Drawable f35473c0;

    /* renamed from: d */
    private final ComponentListener f35474d;

    /* renamed from: d0 */
    private final String f35475d0;

    /* renamed from: e0 */
    private final String f35476e0;

    /* renamed from: f */
    private final CopyOnWriteArrayList<VisibilityListener> f35477f;

    /* renamed from: f0 */
    private final Drawable f35478f0;

    /* renamed from: g */
    private final RecyclerView f35479g;

    /* renamed from: g0 */
    private final Drawable f35480g0;

    /* renamed from: h */
    private final SettingsAdapter f35481h;

    /* renamed from: h0 */
    private final String f35482h0;

    /* renamed from: i */
    private final PlaybackSpeedAdapter f35483i;

    /* renamed from: i0 */
    private final String f35484i0;

    /* renamed from: j */
    private final TextTrackSelectionAdapter f35485j;
    @Nullable

    /* renamed from: j0 */
    private Player f35486j0;

    /* renamed from: k */
    private final AudioTrackSelectionAdapter f35487k;
    @Nullable

    /* renamed from: k0 */
    private ProgressUpdateListener f35488k0;

    /* renamed from: l */
    private final TrackNameProvider f35489l;
    @Nullable

    /* renamed from: l0 */
    private OnFullScreenModeChangedListener f35490l0;

    /* renamed from: m */
    private final PopupWindow f35491m;

    /* renamed from: m0 */
    private boolean f35492m0;

    /* renamed from: n */
    private final int f35493n;

    /* renamed from: n0 */
    private boolean f35494n0;
    @Nullable

    /* renamed from: o */
    private final View f35495o;

    /* renamed from: o0 */
    private boolean f35496o0;
    @Nullable

    /* renamed from: p */
    private final View f35497p;

    /* renamed from: p0 */
    private boolean f35498p0;
    @Nullable

    /* renamed from: q */
    private final View f35499q;

    /* renamed from: q0 */
    private boolean f35500q0;
    @Nullable

    /* renamed from: r */
    private final View f35501r;

    /* renamed from: r0 */
    private int f35502r0;
    @Nullable

    /* renamed from: s */
    private final View f35503s;

    /* renamed from: s0 */
    private int f35504s0;
    @Nullable

    /* renamed from: t */
    private final TextView f35505t;

    /* renamed from: t0 */
    private int f35506t0;
    @Nullable

    /* renamed from: u */
    private final TextView f35507u;

    /* renamed from: u0 */
    private long[] f35508u0;
    @Nullable

    /* renamed from: v */
    private final ImageView f35509v;

    /* renamed from: v0 */
    private boolean[] f35510v0;
    @Nullable

    /* renamed from: w */
    private final ImageView f35511w;

    /* renamed from: w0 */
    private long[] f35512w0;
    @Nullable

    /* renamed from: x */
    private final View f35513x;

    /* renamed from: x0 */
    private boolean[] f35514x0;
    @Nullable

    /* renamed from: y */
    private final ImageView f35515y;

    /* renamed from: y0 */
    private long f35516y0;
    @Nullable

    /* renamed from: z */
    private final ImageView f35517z;

    /* renamed from: z0 */
    private boolean f35518z0;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter */
    /* loaded from: classes4.dex */
    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private AudioTrackSelectionAdapter() {
            super();
            StyledPlayerControlView.this = r1;
        }

        /* renamed from: d */
        private boolean m72942d(TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.f35534j.size(); i++) {
                if (trackSelectionParameters.overrides.containsKey(this.f35534j.get(i).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (StyledPlayerControlView.this.f35486j0 == null) {
                return;
            }
            ((Player) Util.castNonNull(StyledPlayerControlView.this.f35486j0)).setTrackSelectionParameters(StyledPlayerControlView.this.f35486j0.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            StyledPlayerControlView.this.f35481h.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(C16096R.C16103string.exo_track_selection_auto));
            StyledPlayerControlView.this.f35491m.dismiss();
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            this.f35534j = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(StyledPlayerControlView.this.f35486j0)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.f35481h.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(C16096R.C16103string.exo_track_selection_none));
            } else if (!m72942d(trackSelectionParameters)) {
                StyledPlayerControlView.this.f35481h.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(C16096R.C16103string.exo_track_selection_auto));
            } else {
                for (int i = 0; i < list.size(); i++) {
                    TrackInformation trackInformation = list.get(i);
                    if (trackInformation.isSelected()) {
                        StyledPlayerControlView.this.f35481h.setSubTextAtPosition(1, trackInformation.trackName);
                        return;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            int i;
            subSettingViewHolder.textView.setText(C16096R.C16103string.exo_track_selection_auto);
            boolean m72942d = m72942d(((Player) Assertions.checkNotNull(StyledPlayerControlView.this.f35486j0)).getTrackSelectionParameters());
            View view = subSettingViewHolder.checkView;
            if (m72942d) {
                i = 4;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.k
                {
                    StyledPlayerControlView.AudioTrackSelectionAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.AudioTrackSelectionAdapter.this.lambda$onBindViewHolderAtZeroPosition$0(view2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
            StyledPlayerControlView.this.f35481h.setSubTextAtPosition(1, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$ComponentListener */
    /* loaded from: classes4.dex */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
            StyledPlayerControlView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = StyledPlayerControlView.this.f35486j0;
            if (player == null) {
                return;
            }
            StyledPlayerControlView.this.f35470b.resetHideCallbacks();
            if (StyledPlayerControlView.this.f35497p == view) {
                player.seekToNext();
            } else if (StyledPlayerControlView.this.f35495o == view) {
                player.seekToPrevious();
            } else if (StyledPlayerControlView.this.f35501r == view) {
                if (player.getPlaybackState() != 4) {
                    player.seekForward();
                }
            } else if (StyledPlayerControlView.this.f35503s == view) {
                player.seekBack();
            } else if (StyledPlayerControlView.this.f35499q == view) {
                StyledPlayerControlView.this.m72999V(player);
            } else if (StyledPlayerControlView.this.f35509v == view) {
                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), StyledPlayerControlView.this.f35506t0));
            } else if (StyledPlayerControlView.this.f35511w == view) {
                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
            } else if (StyledPlayerControlView.this.f35447B == view) {
                StyledPlayerControlView.this.f35470b.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.m72998W(styledPlayerControlView.f35481h, StyledPlayerControlView.this.f35447B);
            } else if (StyledPlayerControlView.this.f35448C == view) {
                StyledPlayerControlView.this.f35470b.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.m72998W(styledPlayerControlView2.f35483i, StyledPlayerControlView.this.f35448C);
            } else if (StyledPlayerControlView.this.f35449D == view) {
                StyledPlayerControlView.this.f35470b.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.m72998W(styledPlayerControlView3.f35487k, StyledPlayerControlView.this.f35449D);
            } else if (StyledPlayerControlView.this.f35515y == view) {
                StyledPlayerControlView.this.f35470b.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.m72998W(styledPlayerControlView4.f35485j, StyledPlayerControlView.this.f35515y);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.f35518z0) {
                StyledPlayerControlView.this.f35470b.resetHideCallbacks();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                StyledPlayerControlView.this.m72961q0();
            }
            if (events.containsAny(4, 5, 7)) {
                StyledPlayerControlView.this.m72957s0();
            }
            if (events.contains(8)) {
                StyledPlayerControlView.this.m72955t0();
            }
            if (events.contains(9)) {
                StyledPlayerControlView.this.m72949w0();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.m72963p0();
            }
            if (events.containsAny(11, 0)) {
                StyledPlayerControlView.this.m72947x0();
            }
            if (events.contains(12)) {
                StyledPlayerControlView.this.m72959r0();
            }
            if (events.contains(2)) {
                StyledPlayerControlView.this.m72945y0();
            }
        }

        @Override // com.google.android.exoplayer2.p380ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (StyledPlayerControlView.this.f35451F != null) {
                StyledPlayerControlView.this.f35451F.setText(Util.getStringForTime(StyledPlayerControlView.this.f35453H, StyledPlayerControlView.this.f35454I, j));
            }
        }

        @Override // com.google.android.exoplayer2.p380ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            StyledPlayerControlView.this.f35500q0 = true;
            if (StyledPlayerControlView.this.f35451F != null) {
                StyledPlayerControlView.this.f35451F.setText(Util.getStringForTime(StyledPlayerControlView.this.f35453H, StyledPlayerControlView.this.f35454I, j));
            }
            StyledPlayerControlView.this.f35470b.removeHideCallbacks();
        }

        @Override // com.google.android.exoplayer2.p380ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            StyledPlayerControlView.this.f35500q0 = false;
            if (!z && StyledPlayerControlView.this.f35486j0 != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.m72977i0(styledPlayerControlView.f35486j0, j);
            }
            StyledPlayerControlView.this.f35470b.resetHideCallbacks();
        }
    }

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$OnFullScreenModeChangedListener */
    /* loaded from: classes4.dex */
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter */
    /* loaded from: classes4.dex */
    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* renamed from: j */
        private final String[] f35521j;

        /* renamed from: k */
        private final float[] f35522k;

        /* renamed from: l */
        private int f35523l;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            StyledPlayerControlView.this = r1;
            this.f35521j = strArr;
            this.f35522k = fArr;
        }

        public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
            if (i != this.f35523l) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.f35522k[i]);
            }
            StyledPlayerControlView.this.f35491m.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f35521j.length;
        }

        public String getSelectedText() {
            return this.f35521j[this.f35523l];
        }

        public void updateSelectedIndex(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f35522k;
                if (i < fArr.length) {
                    float abs = Math.abs(f - fArr[i]);
                    if (abs < f2) {
                        i2 = i;
                        f2 = abs;
                    }
                    i++;
                } else {
                    this.f35523l = i2;
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i) {
            String[] strArr = this.f35521j;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            if (i == this.f35523l) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.l
                {
                    StyledPlayerControlView.PlaybackSpeedAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.PlaybackSpeedAdapter.this.lambda$onBindViewHolder$0(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C16096R.C16102layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$ProgressUpdateListener */
    /* loaded from: classes4.dex */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder */
    /* loaded from: classes4.dex */
    public final class SettingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: l */
        private final TextView f35525l;

        /* renamed from: m */
        private final TextView f35526m;

        /* renamed from: n */
        private final ImageView f35527n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingViewHolder(View view) {
            super(view);
            StyledPlayerControlView.this = r2;
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f35525l = (TextView) view.findViewById(C16096R.C16101id.exo_main_text);
            this.f35526m = (TextView) view.findViewById(C16096R.C16101id.exo_sub_text);
            this.f35527n = (ImageView) view.findViewById(C16096R.C16101id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.m
                {
                    StyledPlayerControlView.SettingViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.SettingViewHolder.this.lambda$new$0(view2);
                }
            });
        }

        public /* synthetic */ void lambda$new$0(View view) {
            StyledPlayerControlView.this.m72983f0(getAdapterPosition());
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter */
    /* loaded from: classes4.dex */
    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {

        /* renamed from: j */
        private final String[] f35529j;

        /* renamed from: k */
        private final String[] f35530k;

        /* renamed from: l */
        private final Drawable[] f35531l;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            StyledPlayerControlView.this = r1;
            this.f35529j = strArr;
            this.f35530k = new String[strArr.length];
            this.f35531l = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f35529j.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public void setSubTextAtPosition(int i, String str) {
            this.f35530k[i] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i) {
            settingViewHolder.f35525l.setText(this.f35529j[i]);
            if (this.f35530k[i] == null) {
                settingViewHolder.f35526m.setVisibility(8);
            } else {
                settingViewHolder.f35526m.setText(this.f35530k[i]);
            }
            if (this.f35531l[i] == null) {
                settingViewHolder.f35527n.setVisibility(8);
            } else {
                settingViewHolder.f35527n.setImageDrawable(this.f35531l[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C16096R.C16102layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder */
    /* loaded from: classes4.dex */
    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(C16096R.C16101id.exo_text);
            this.checkView = view.findViewById(C16096R.C16101id.exo_check);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter */
    /* loaded from: classes4.dex */
    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private TextTrackSelectionAdapter() {
            super();
            StyledPlayerControlView.this = r1;
        }

        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (StyledPlayerControlView.this.f35486j0 != null) {
                StyledPlayerControlView.this.f35486j0.setTrackSelectionParameters(StyledPlayerControlView.this.f35486j0.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
                StyledPlayerControlView.this.f35491m.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i).isSelected()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (StyledPlayerControlView.this.f35515y != null) {
                ImageView imageView = StyledPlayerControlView.this.f35515y;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z ? styledPlayerControlView.f35471b0 : styledPlayerControlView.f35473c0);
                StyledPlayerControlView.this.f35515y.setContentDescription(z ? StyledPlayerControlView.this.f35475d0 : StyledPlayerControlView.this.f35476e0);
            }
            this.f35534j = list;
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(C16096R.C16103string.exo_track_selection_none);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < this.f35534j.size()) {
                    if (this.f35534j.get(i2).isSelected()) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            View view = subSettingViewHolder.checkView;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.n
                {
                    StyledPlayerControlView.TextTrackSelectionAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.TextTrackSelectionAdapter.this.lambda$onBindViewHolderAtZeroPosition$0(view2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                subSettingViewHolder.checkView.setVisibility(this.f35534j.get(i + (-1)).isSelected() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.p380ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation */
    /* loaded from: classes4.dex */
    public static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i, int i2, String str) {
            this.trackGroup = tracks.getGroups().get(i);
            this.trackIndex = i2;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackSelectionAdapter */
    /* loaded from: classes4.dex */
    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* renamed from: j */
        protected List<TrackInformation> f35534j = new ArrayList();

        protected TrackSelectionAdapter() {
            StyledPlayerControlView.this = r1;
        }

        /* renamed from: b */
        public /* synthetic */ void m72934b(Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
            player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, ImmutableList.m69423of(Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
            onTrackSelection(trackInformation.trackName);
            StyledPlayerControlView.this.f35491m.dismiss();
        }

        protected void clear() {
            this.f35534j = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f35534j.isEmpty()) {
                return 0;
            }
            return this.f35534j.size() + 1;
        }

        public abstract void init(List<TrackInformation> list);

        protected abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        protected abstract void onTrackSelection(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            final Player player = StyledPlayerControlView.this.f35486j0;
            if (player == null) {
                return;
            }
            if (i == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            boolean z = true;
            final TrackInformation trackInformation = this.f35534j.get(i - 1);
            final TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            if (player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) == null || !trackInformation.isSelected()) {
                z = false;
            }
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.TrackSelectionAdapter.this.m72934b(player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C16096R.C16102layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$VisibilityListener */
    /* loaded from: classes4.dex */
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
        f35445A0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }

    /* renamed from: S */
    private static boolean m73002S(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: T */
    private void m73001T(Player player) {
        player.pause();
    }

    /* renamed from: U */
    private void m73000U(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            m72979h0(player, player.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        player.play();
    }

    /* renamed from: V */
    public void m72999V(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState != 1 && playbackState != 4 && player.getPlayWhenReady()) {
            m73001T(player);
        } else {
            m73000U(player);
        }
    }

    /* renamed from: W */
    public void m72998W(RecyclerView.Adapter<?> adapter, View view) {
        this.f35479g.setAdapter(adapter);
        m72951v0();
        this.f35518z0 = false;
        this.f35491m.dismiss();
        this.f35518z0 = true;
        this.f35491m.showAsDropDown(view, (getWidth() - this.f35491m.getWidth()) - this.f35493n, (-this.f35491m.getHeight()) - this.f35493n);
    }

    /* renamed from: X */
    private ImmutableList<TrackInformation> m72997X(Tracks tracks, int i) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                for (int i3 = 0; i3 < group.length; i3++) {
                    if (group.isTrackSupported(i3)) {
                        Format trackFormat = group.getTrackFormat(i3);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            builder.add((ImmutableList.Builder) new TrackInformation(tracks, i2, i3, this.f35489l.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    /* renamed from: Y */
    private static int m72996Y(TypedArray typedArray, int i) {
        return typedArray.getInt(C16096R.styleable.StyledPlayerControlView_repeat_toggle_modes, i);
    }

    /* renamed from: Z */
    private void m72995Z() {
        this.f35485j.clear();
        this.f35487k.clear();
        Player player = this.f35486j0;
        if (player != null && player.isCommandAvailable(30) && this.f35486j0.isCommandAvailable(29)) {
            Tracks currentTracks = this.f35486j0.getCurrentTracks();
            this.f35487k.init(m72997X(currentTracks, 1));
            if (this.f35470b.getShowButton(this.f35515y)) {
                this.f35485j.init(m72997X(currentTracks, 3));
            } else {
                this.f35485j.init(ImmutableList.m69424of());
            }
        }
    }

    /* renamed from: a0 */
    private static void m72993a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b0 */
    private static boolean m72991b0(int i) {
        if (i != 90 && i != 89 && i != 85 && i != 79 && i != 126 && i != 127 && i != 87 && i != 88) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    public void m72987d0(View view) {
        if (this.f35490l0 == null) {
            return;
        }
        boolean z = !this.f35492m0;
        this.f35492m0 = z;
        m72967n0(this.f35517z, z);
        m72967n0(this.f35446A, this.f35492m0);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.f35490l0;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.f35492m0);
        }
    }

    /* renamed from: e0 */
    public void m72985e0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if ((i3 - i != i7 - i5 || i9 != i10) && this.f35491m.isShowing()) {
            m72951v0();
            this.f35491m.update(view, (getWidth() - this.f35491m.getWidth()) - this.f35493n, (-this.f35491m.getHeight()) - this.f35493n, -1, -1);
        }
    }

    /* renamed from: f0 */
    public void m72983f0(int i) {
        if (i == 0) {
            m72998W(this.f35483i, (View) Assertions.checkNotNull(this.f35447B));
        } else if (i == 1) {
            m72998W(this.f35487k, (View) Assertions.checkNotNull(this.f35447B));
        } else {
            this.f35491m.dismiss();
        }
    }

    /* renamed from: h0 */
    private void m72979h0(Player player, int i, long j) {
        player.seekTo(i, j);
    }

    /* renamed from: i0 */
    public void m72977i0(Player player, long j) {
        int currentMediaItemIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.f35498p0 && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.f35456K).getDurationMs();
                if (j < durationMs) {
                    break;
                } else if (currentMediaItemIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        m72979h0(player, currentMediaItemIndex, j);
        m72957s0();
    }

    /* renamed from: j0 */
    private boolean m72975j0() {
        Player player = this.f35486j0;
        if (player != null && player.getPlaybackState() != 4 && this.f35486j0.getPlaybackState() != 1 && this.f35486j0.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    private void m72971l0(boolean z, @Nullable View view) {
        float f;
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (z) {
            f = this.f35466U;
        } else {
            f = this.f35467V;
        }
        view.setAlpha(f);
    }

    /* renamed from: m0 */
    private void m72969m0() {
        long j;
        Player player = this.f35486j0;
        if (player != null) {
            j = player.getSeekForwardIncrement();
        } else {
            j = 15000;
        }
        int i = (int) (j / 1000);
        TextView textView = this.f35505t;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.f35501r;
        if (view != null) {
            view.setContentDescription(this.f35472c.getQuantityString(C16096R.plurals.exo_controls_fastforward_by_amount_description, i, Integer.valueOf(i)));
        }
    }

    /* renamed from: n0 */
    private void m72967n0(@Nullable ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.f35478f0);
            imageView.setContentDescription(this.f35482h0);
            return;
        }
        imageView.setImageDrawable(this.f35480g0);
        imageView.setContentDescription(this.f35484i0);
    }

    /* renamed from: o0 */
    private static void m72965o0(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: p0 */
    public void m72963p0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (isVisible() && this.f35494n0) {
            Player player = this.f35486j0;
            if (player != null) {
                z = player.isCommandAvailable(5);
                z3 = player.isCommandAvailable(7);
                z4 = player.isCommandAvailable(11);
                z5 = player.isCommandAvailable(12);
                z2 = player.isCommandAvailable(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (z4) {
                m72953u0();
            }
            if (z5) {
                m72969m0();
            }
            m72971l0(z3, this.f35495o);
            m72971l0(z4, this.f35503s);
            m72971l0(z5, this.f35501r);
            m72971l0(z2, this.f35497p);
            TimeBar timeBar = this.f35452G;
            if (timeBar != null) {
                timeBar.setEnabled(z);
            }
        }
    }

    /* renamed from: q0 */
    public void m72961q0() {
        if (isVisible() && this.f35494n0 && this.f35499q != null) {
            if (m72975j0()) {
                ((ImageView) this.f35499q).setImageDrawable(this.f35472c.getDrawable(C16096R.C16099drawable.exo_styled_controls_pause));
                this.f35499q.setContentDescription(this.f35472c.getString(C16096R.C16103string.exo_controls_pause_description));
                return;
            }
            ((ImageView) this.f35499q).setImageDrawable(this.f35472c.getDrawable(C16096R.C16099drawable.exo_styled_controls_play));
            this.f35499q.setContentDescription(this.f35472c.getString(C16096R.C16103string.exo_controls_play_description));
        }
    }

    /* renamed from: r0 */
    public void m72959r0() {
        Player player = this.f35486j0;
        if (player == null) {
            return;
        }
        this.f35483i.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.f35481h.setSubTextAtPosition(0, this.f35483i.getSelectedText());
    }

    /* renamed from: s0 */
    public void m72957s0() {
        long j;
        long j2;
        int playbackState;
        long j3;
        if (isVisible() && this.f35494n0) {
            Player player = this.f35486j0;
            if (player != null) {
                j = this.f35516y0 + player.getContentPosition();
                j2 = this.f35516y0 + player.getContentBufferedPosition();
            } else {
                j = 0;
                j2 = 0;
            }
            TextView textView = this.f35451F;
            if (textView != null && !this.f35500q0) {
                textView.setText(Util.getStringForTime(this.f35453H, this.f35454I, j));
            }
            TimeBar timeBar = this.f35452G;
            if (timeBar != null) {
                timeBar.setPosition(j);
                this.f35452G.setBufferedPosition(j2);
            }
            ProgressUpdateListener progressUpdateListener = this.f35488k0;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(j, j2);
            }
            removeCallbacks(this.f35457L);
            if (player == null) {
                playbackState = 1;
            } else {
                playbackState = player.getPlaybackState();
            }
            long j4 = 1000;
            if (player != null && player.isPlaying()) {
                TimeBar timeBar2 = this.f35452G;
                if (timeBar2 != null) {
                    j3 = timeBar2.getPreferredUpdateDelay();
                } else {
                    j3 = 1000;
                }
                long min = Math.min(j3, 1000 - (j % 1000));
                float f = player.getPlaybackParameters().speed;
                if (f > 0.0f) {
                    j4 = ((float) min) / f;
                }
                postDelayed(this.f35457L, Util.constrainValue(j4, this.f35504s0, 1000L));
            } else if (playbackState != 4 && playbackState != 1) {
                postDelayed(this.f35457L, 1000L);
            }
        }
    }

    public void setPlaybackSpeed(float f) {
        Player player = this.f35486j0;
        if (player == null) {
            return;
        }
        player.setPlaybackParameters(player.getPlaybackParameters().withSpeed(f));
    }

    /* renamed from: t0 */
    public void m72955t0() {
        ImageView imageView;
        if (isVisible() && this.f35494n0 && (imageView = this.f35509v) != null) {
            if (this.f35506t0 == 0) {
                m72971l0(false, imageView);
                return;
            }
            Player player = this.f35486j0;
            if (player == null) {
                m72971l0(false, imageView);
                this.f35509v.setImageDrawable(this.f35458M);
                this.f35509v.setContentDescription(this.f35461P);
                return;
            }
            m72971l0(true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode != 0) {
                if (repeatMode != 1) {
                    if (repeatMode == 2) {
                        this.f35509v.setImageDrawable(this.f35460O);
                        this.f35509v.setContentDescription(this.f35463R);
                        return;
                    }
                    return;
                }
                this.f35509v.setImageDrawable(this.f35459N);
                this.f35509v.setContentDescription(this.f35462Q);
                return;
            }
            this.f35509v.setImageDrawable(this.f35458M);
            this.f35509v.setContentDescription(this.f35461P);
        }
    }

    /* renamed from: u0 */
    private void m72953u0() {
        long j;
        Player player = this.f35486j0;
        if (player != null) {
            j = player.getSeekBackIncrement();
        } else {
            j = 5000;
        }
        int i = (int) (j / 1000);
        TextView textView = this.f35507u;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.f35503s;
        if (view != null) {
            view.setContentDescription(this.f35472c.getQuantityString(C16096R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
        }
    }

    /* renamed from: v0 */
    private void m72951v0() {
        this.f35479g.measure(0, 0);
        this.f35491m.setWidth(Math.min(this.f35479g.getMeasuredWidth(), getWidth() - (this.f35493n * 2)));
        this.f35491m.setHeight(Math.min(getHeight() - (this.f35493n * 2), this.f35479g.getMeasuredHeight()));
    }

    /* renamed from: w0 */
    public void m72949w0() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (isVisible() && this.f35494n0 && (imageView = this.f35511w) != null) {
            Player player = this.f35486j0;
            if (!this.f35470b.getShowButton(imageView)) {
                m72971l0(false, this.f35511w);
            } else if (player == null) {
                m72971l0(false, this.f35511w);
                this.f35511w.setImageDrawable(this.f35465T);
                this.f35511w.setContentDescription(this.f35469a0);
            } else {
                m72971l0(true, this.f35511w);
                ImageView imageView2 = this.f35511w;
                if (player.getShuffleModeEnabled()) {
                    drawable = this.f35464S;
                } else {
                    drawable = this.f35465T;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f35511w;
                if (player.getShuffleModeEnabled()) {
                    str = this.f35468W;
                } else {
                    str = this.f35469a0;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* renamed from: x0 */
    public void m72947x0() {
        boolean z;
        int i;
        int i2;
        int i3;
        Timeline.Window window;
        int length;
        Player player = this.f35486j0;
        if (player == null) {
            return;
        }
        boolean z2 = true;
        if (this.f35496o0 && m73002S(player.getCurrentTimeline(), this.f35456K)) {
            z = true;
        } else {
            z = false;
        }
        this.f35498p0 = z;
        long j = 0;
        this.f35516y0 = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (!currentTimeline.isEmpty()) {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z3 = this.f35498p0;
            if (z3) {
                i2 = 0;
            } else {
                i2 = currentMediaItemIndex;
            }
            if (z3) {
                i3 = currentTimeline.getWindowCount() - 1;
            } else {
                i3 = currentMediaItemIndex;
            }
            long j2 = 0;
            i = 0;
            while (true) {
                if (i2 > i3) {
                    break;
                }
                if (i2 == currentMediaItemIndex) {
                    this.f35516y0 = Util.usToMs(j2);
                }
                currentTimeline.getWindow(i2, this.f35456K);
                Timeline.Window window2 = this.f35456K;
                if (window2.durationUs == -9223372036854775807L) {
                    Assertions.checkState(this.f35498p0 ^ z2);
                    break;
                }
                int i4 = window2.firstPeriodIndex;
                while (true) {
                    window = this.f35456K;
                    if (i4 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i4, this.f35455J);
                        int adGroupCount = this.f35455J.getAdGroupCount();
                        for (int removedAdGroupCount = this.f35455J.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                            long adGroupTimeUs = this.f35455J.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j3 = this.f35455J.durationUs;
                                if (j3 != -9223372036854775807L) {
                                    adGroupTimeUs = j3;
                                }
                            }
                            long positionInWindowUs = adGroupTimeUs + this.f35455J.getPositionInWindowUs();
                            if (positionInWindowUs >= 0) {
                                long[] jArr = this.f35508u0;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f35508u0 = Arrays.copyOf(jArr, length);
                                    this.f35510v0 = Arrays.copyOf(this.f35510v0, length);
                                }
                                this.f35508u0[i] = Util.usToMs(j2 + positionInWindowUs);
                                this.f35510v0[i] = this.f35455J.hasPlayedAdGroup(removedAdGroupCount);
                                i++;
                            }
                        }
                        i4++;
                    }
                }
                j2 += window.durationUs;
                i2++;
                z2 = true;
            }
            j = j2;
        } else {
            i = 0;
        }
        long usToMs = Util.usToMs(j);
        TextView textView = this.f35450E;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.f35453H, this.f35454I, usToMs));
        }
        TimeBar timeBar = this.f35452G;
        if (timeBar != null) {
            timeBar.setDuration(usToMs);
            int length2 = this.f35512w0.length;
            int i5 = i + length2;
            long[] jArr2 = this.f35508u0;
            if (i5 > jArr2.length) {
                this.f35508u0 = Arrays.copyOf(jArr2, i5);
                this.f35510v0 = Arrays.copyOf(this.f35510v0, i5);
            }
            System.arraycopy(this.f35512w0, 0, this.f35508u0, i, length2);
            System.arraycopy(this.f35514x0, 0, this.f35510v0, i, length2);
            this.f35452G.setAdGroupTimesMs(this.f35508u0, this.f35510v0, i5);
        }
        m72957s0();
    }

    /* renamed from: y0 */
    public void m72945y0() {
        boolean z;
        m72995Z();
        if (this.f35485j.getItemCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        m72971l0(z, this.f35515y);
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.f35477f.add(visibilityListener);
    }

    /* renamed from: c0 */
    public void m72989c0() {
        Iterator<VisibilityListener> it = this.f35477f.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!dispatchMediaKeyEvent(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f35486j0;
        if (player != null && m72991b0(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (player.getPlaybackState() != 4) {
                        player.seekForward();
                        return true;
                    }
                    return true;
                } else if (keyCode == 89) {
                    player.seekBack();
                    return true;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        m73001T(player);
                                        return true;
                                    }
                                    return true;
                                }
                                m73000U(player);
                                return true;
                            }
                            player.seekToPrevious();
                            return true;
                        }
                        player.seekToNext();
                        return true;
                    }
                    m72999V(player);
                    return true;
                } else {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public void m72981g0() {
        View view = this.f35499q;
        if (view != null) {
            view.requestFocus();
        }
    }

    @Nullable
    public Player getPlayer() {
        return this.f35486j0;
    }

    public int getRepeatToggleModes() {
        return this.f35506t0;
    }

    public boolean getShowShuffleButton() {
        return this.f35470b.getShowButton(this.f35511w);
    }

    public boolean getShowSubtitleButton() {
        return this.f35470b.getShowButton(this.f35515y);
    }

    public int getShowTimeoutMs() {
        return this.f35502r0;
    }

    public boolean getShowVrButton() {
        return this.f35470b.getShowButton(this.f35513x);
    }

    public void hide() {
        this.f35470b.hide();
    }

    public void hideImmediately() {
        this.f35470b.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.f35470b.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.f35470b.isFullyVisible();
    }

    public boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public void m72973k0() {
        m72961q0();
        m72963p0();
        m72955t0();
        m72949w0();
        m72945y0();
        m72959r0();
        m72947x0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35470b.onAttachedToWindow();
        this.f35494n0 = true;
        if (isFullyVisible()) {
            this.f35470b.resetHideCallbacks();
        }
        m72973k0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35470b.onDetachedFromWindow();
        this.f35494n0 = false;
        removeCallbacks(this.f35457L);
        this.f35470b.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f35470b.onLayout(z, i, i2, i3, i4);
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.f35477f.remove(visibilityListener);
    }

    public void setAnimationEnabled(boolean z) {
        this.f35470b.setAnimationEnabled(z);
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.f35512w0 = new long[0];
            this.f35514x0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            if (jArr.length == zArr2.length) {
                z = true;
            }
            Assertions.checkArgument(z);
            this.f35512w0 = jArr;
            this.f35514x0 = zArr2;
        }
        m72947x0();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        boolean z;
        this.f35490l0 = onFullScreenModeChangedListener;
        ImageView imageView = this.f35517z;
        boolean z2 = true;
        if (onFullScreenModeChangedListener != null) {
            z = true;
        } else {
            z = false;
        }
        m72965o0(imageView, z);
        ImageView imageView2 = this.f35446A;
        if (onFullScreenModeChangedListener == null) {
            z2 = false;
        }
        m72965o0(imageView2, z2);
    }

    public void setPlayer(@Nullable Player player) {
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
        Player player2 = this.f35486j0;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.f35474d);
        }
        this.f35486j0 = player;
        if (player != null) {
            player.addListener(this.f35474d);
        }
        m72973k0();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.f35488k0 = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        this.f35506t0 = i;
        Player player = this.f35486j0;
        boolean z = false;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f35486j0.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.f35486j0.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.f35486j0.setRepeatMode(2);
            }
        }
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = this.f35470b;
        ImageView imageView = this.f35509v;
        if (i != 0) {
            z = true;
        }
        styledPlayerControlViewLayoutManager.setShowButton(imageView, z);
        m72955t0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f35470b.setShowButton(this.f35501r, z);
        m72963p0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f35496o0 = z;
        m72947x0();
    }

    public void setShowNextButton(boolean z) {
        this.f35470b.setShowButton(this.f35497p, z);
        m72963p0();
    }

    public void setShowPreviousButton(boolean z) {
        this.f35470b.setShowButton(this.f35495o, z);
        m72963p0();
    }

    public void setShowRewindButton(boolean z) {
        this.f35470b.setShowButton(this.f35503s, z);
        m72963p0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f35470b.setShowButton(this.f35511w, z);
        m72949w0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f35470b.setShowButton(this.f35515y, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f35502r0 = i;
        if (isFullyVisible()) {
            this.f35470b.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f35470b.setShowButton(this.f35513x, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f35504s0 = Util.constrainValue(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f35513x;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            m72971l0(z, this.f35513x);
        }
    }

    public void show() {
        this.f35470b.show();
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.exoplayer2.ui.StyledPlayerControlView$1, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ComponentListener componentListener;
        boolean z9;
        boolean z10;
        ?? r9;
        boolean z11;
        int i2 = C16096R.C16102layout.exo_styled_player_control_view;
        this.f35502r0 = 5000;
        this.f35506t0 = 0;
        this.f35504s0 = 200;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C16096R.styleable.StyledPlayerControlView, i, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(C16096R.styleable.StyledPlayerControlView_controller_layout_id, i2);
                this.f35502r0 = obtainStyledAttributes.getInt(C16096R.styleable.StyledPlayerControlView_show_timeout, this.f35502r0);
                this.f35506t0 = m72996Y(obtainStyledAttributes, this.f35506t0);
                boolean z12 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z13 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z14 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z15 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z16 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z17 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z18 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C16096R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.f35504s0));
                boolean z19 = obtainStyledAttributes.getBoolean(C16096R.styleable.StyledPlayerControlView_animation_enabled, true);
                obtainStyledAttributes.recycle();
                z2 = z16;
                z3 = z17;
                z5 = z12;
                z6 = z13;
                z7 = z14;
                z4 = z19;
                z8 = z15;
                z = z18;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        ComponentListener componentListener2 = new ComponentListener();
        this.f35474d = componentListener2;
        this.f35477f = new CopyOnWriteArrayList<>();
        this.f35455J = new Timeline.Period();
        this.f35456K = new Timeline.Window();
        StringBuilder sb2 = new StringBuilder();
        this.f35453H = sb2;
        this.f35454I = new Formatter(sb2, Locale.getDefault());
        this.f35508u0 = new long[0];
        this.f35510v0 = new boolean[0];
        this.f35512w0 = new long[0];
        this.f35514x0 = new boolean[0];
        this.f35457L = new Runnable() { // from class: com.google.android.exoplayer2.ui.h
            {
                StyledPlayerControlView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StyledPlayerControlView.this.m72957s0();
            }
        };
        this.f35450E = (TextView) findViewById(C16096R.C16101id.exo_duration);
        this.f35451F = (TextView) findViewById(C16096R.C16101id.exo_position);
        ImageView imageView = (ImageView) findViewById(C16096R.C16101id.exo_subtitle);
        this.f35515y = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener2);
        }
        ImageView imageView2 = (ImageView) findViewById(C16096R.C16101id.exo_fullscreen);
        this.f35517z = imageView2;
        m72993a0(imageView2, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.i
            {
                StyledPlayerControlView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StyledPlayerControlView.this.m72987d0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(C16096R.C16101id.exo_minimal_fullscreen);
        this.f35446A = imageView3;
        m72993a0(imageView3, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.i
            {
                StyledPlayerControlView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StyledPlayerControlView.this.m72987d0(view);
            }
        });
        View findViewById = findViewById(C16096R.C16101id.exo_settings);
        this.f35447B = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(componentListener2);
        }
        View findViewById2 = findViewById(C16096R.C16101id.exo_playback_speed);
        this.f35448C = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener2);
        }
        View findViewById3 = findViewById(C16096R.C16101id.exo_audio_track);
        this.f35449D = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener2);
        }
        int i3 = C16096R.C16101id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i3);
        View findViewById4 = findViewById(C16096R.C16101id.exo_progress_placeholder);
        if (timeBar != null) {
            this.f35452G = timeBar;
            componentListener = componentListener2;
            z9 = z4;
            z10 = z;
            r9 = 0;
        } else if (findViewById4 != null) {
            r9 = 0;
            componentListener = componentListener2;
            z9 = z4;
            z10 = z;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, C16096R.C16104style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f35452G = defaultTimeBar;
        } else {
            componentListener = componentListener2;
            z9 = z4;
            z10 = z;
            r9 = 0;
            this.f35452G = null;
        }
        TimeBar timeBar2 = this.f35452G;
        ComponentListener componentListener3 = componentListener;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener3);
        }
        View findViewById5 = findViewById(C16096R.C16101id.exo_play_pause);
        this.f35499q = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener3);
        }
        View findViewById6 = findViewById(C16096R.C16101id.exo_prev);
        this.f35495o = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener3);
        }
        View findViewById7 = findViewById(C16096R.C16101id.exo_next);
        this.f35497p = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener3);
        }
        Typeface font = ResourcesCompat.getFont(context, C16096R.C16100font.roboto_medium_numbers);
        View findViewById8 = findViewById(C16096R.C16101id.exo_rew);
        TextView textView = findViewById8 == null ? (TextView) findViewById(C16096R.C16101id.exo_rew_with_amount) : r9;
        this.f35507u = textView;
        if (textView != null) {
            textView.setTypeface(font);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.f35503s = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(componentListener3);
        }
        View findViewById9 = findViewById(C16096R.C16101id.exo_ffwd);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(C16096R.C16101id.exo_ffwd_with_amount) : r9;
        this.f35505t = textView2;
        if (textView2 != null) {
            textView2.setTypeface(font);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.f35501r = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(componentListener3);
        }
        ImageView imageView4 = (ImageView) findViewById(C16096R.C16101id.exo_repeat_toggle);
        this.f35509v = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener3);
        }
        ImageView imageView5 = (ImageView) findViewById(C16096R.C16101id.exo_shuffle);
        this.f35511w = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(componentListener3);
        }
        Resources resources = context.getResources();
        this.f35472c = resources;
        this.f35466U = resources.getInteger(C16096R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f35467V = resources.getInteger(C16096R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(C16096R.C16101id.exo_vr);
        this.f35513x = findViewById10;
        if (findViewById10 != null) {
            m72971l0(false, findViewById10);
        }
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = new StyledPlayerControlViewLayoutManager(this);
        this.f35470b = styledPlayerControlViewLayoutManager;
        styledPlayerControlViewLayoutManager.setAnimationEnabled(z9);
        SettingsAdapter settingsAdapter = new SettingsAdapter(new String[]{resources.getString(C16096R.C16103string.exo_controls_playback_speed), resources.getString(C16096R.C16103string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_speed), resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_audiotrack)});
        this.f35481h = settingsAdapter;
        this.f35493n = resources.getDimensionPixelSize(C16096R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(C16096R.C16102layout.exo_styled_settings_list, (ViewGroup) r9);
        this.f35479g = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f35491m = popupWindow;
        if (Util.SDK_INT < 23) {
            z11 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z11 = false;
        }
        popupWindow.setOnDismissListener(componentListener3);
        this.f35518z0 = true;
        this.f35489l = new DefaultTrackNameProvider(getResources());
        this.f35471b0 = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_subtitle_on);
        this.f35473c0 = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_subtitle_off);
        this.f35475d0 = resources.getString(C16096R.C16103string.exo_controls_cc_enabled_description);
        this.f35476e0 = resources.getString(C16096R.C16103string.exo_controls_cc_disabled_description);
        this.f35485j = new TextTrackSelectionAdapter();
        this.f35487k = new AudioTrackSelectionAdapter();
        this.f35483i = new PlaybackSpeedAdapter(resources.getStringArray(C16096R.C16097array.exo_controls_playback_speeds), f35445A0);
        this.f35478f0 = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_fullscreen_exit);
        this.f35480g0 = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_fullscreen_enter);
        this.f35458M = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_repeat_off);
        this.f35459N = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_repeat_one);
        this.f35460O = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_repeat_all);
        this.f35464S = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_shuffle_on);
        this.f35465T = resources.getDrawable(C16096R.C16099drawable.exo_styled_controls_shuffle_off);
        this.f35482h0 = resources.getString(C16096R.C16103string.exo_controls_fullscreen_exit_description);
        this.f35484i0 = resources.getString(C16096R.C16103string.exo_controls_fullscreen_enter_description);
        this.f35461P = this.f35472c.getString(C16096R.C16103string.exo_controls_repeat_off_description);
        this.f35462Q = this.f35472c.getString(C16096R.C16103string.exo_controls_repeat_one_description);
        this.f35463R = this.f35472c.getString(C16096R.C16103string.exo_controls_repeat_all_description);
        this.f35468W = this.f35472c.getString(C16096R.C16103string.exo_controls_shuffle_on_description);
        this.f35469a0 = this.f35472c.getString(C16096R.C16103string.exo_controls_shuffle_off_description);
        this.f35470b.setShowButton((ViewGroup) findViewById(C16096R.C16101id.exo_bottom_bar), true);
        this.f35470b.setShowButton(this.f35501r, z6);
        this.f35470b.setShowButton(this.f35503s, z5);
        this.f35470b.setShowButton(this.f35495o, z7);
        this.f35470b.setShowButton(this.f35497p, z8);
        this.f35470b.setShowButton(this.f35511w, z2);
        this.f35470b.setShowButton(this.f35515y, z3);
        this.f35470b.setShowButton(this.f35513x, z10);
        this.f35470b.setShowButton(this.f35509v, this.f35506t0 != 0 ? true : z11);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.j
            {
                StyledPlayerControlView.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                StyledPlayerControlView.this.m72985e0(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }
}
