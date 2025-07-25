package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzdin {
    void zzA(View view, Map map);

    boolean zzB();

    boolean zzC();

    boolean zzD(Bundle bundle);

    int zza();

    JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzh();

    void zzi();

    void zzj();

    void zzk(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar);

    void zzl(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType);

    void zzm(String str);

    void zzn(Bundle bundle);

    void zzp(@Nullable View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i);

    void zzq();

    void zzr(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzs();

    void zzt(@Nullable View view, MotionEvent motionEvent, View view2);

    void zzu(Bundle bundle);

    void zzv(View view);

    void zzw();

    void zzx(com.google.android.gms.ads.internal.client.zzdd zzddVar);

    void zzy(zzbhq zzbhqVar);

    void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);
}
