package io.bidmachine.models;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes9.dex */
public interface ICustomParams<SelfType> {
    SelfType addParam(@NonNull String str, @NonNull String str2);

    SelfType addParams(@NonNull Map<String, String> map);
}
