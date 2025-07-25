package p734j1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.InterfaceC10505b;
import com.explorestack.iab.vast.activity.VastActivity;
import p678g1.C33182b;

/* renamed from: j1.b */
/* loaded from: classes3.dex */
public interface InterfaceC37247b {
    void onVastClick(@NonNull VastActivity vastActivity, @NonNull C37250e c37250e, @NonNull InterfaceC10505b interfaceC10505b, @Nullable String str);

    void onVastComplete(@NonNull VastActivity vastActivity, @NonNull C37250e c37250e);

    void onVastDismiss(@NonNull VastActivity vastActivity, @Nullable C37250e c37250e, boolean z);

    void onVastShowFailed(@Nullable C37250e c37250e, @NonNull C33182b c33182b);

    void onVastShown(@NonNull VastActivity vastActivity, @NonNull C37250e c37250e);
}
