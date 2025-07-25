package sb;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p671fb.Expression;

@Metadata
/* renamed from: sb.ok */
/* loaded from: classes8.dex */
public interface DivSightAction {
    @Nullable
    /* renamed from: a */
    DivDownloadCallbacks mo8429a();

    @NotNull
    /* renamed from: b */
    Expression<String> mo8428b();

    @NotNull
    /* renamed from: c */
    Expression<Long> mo8427c();

    @Nullable
    /* renamed from: d */
    DivActionTyped mo8426d();

    @Nullable
    /* renamed from: e */
    Expression<Uri> mo8425e();

    @Nullable
    JSONObject getPayload();

    @Nullable
    Expression<Uri> getUrl();

    @NotNull
    Expression<Boolean> isEnabled();
}
