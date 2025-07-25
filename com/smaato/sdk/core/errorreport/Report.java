package com.smaato.sdk.core.errorreport;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.remoteconfig.publisher.Param;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes7.dex */
public final class Report {
    public static final Report EMPTY = new Report(Collections.emptyList(), 0);
    @NonNull
    private final List<Param> params;
    private final Random random = new Random();
    private final int sampleRate;

    public Report(@NonNull List<Param> list, int i) {
        this.params = Lists.toImmutableList((Collection) list);
        this.sampleRate = i;
    }

    public static /* synthetic */ boolean lambda$toQuery$0(Param param) {
        if (param.getValue() != null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String lambda$toQuery$1(Param param) {
        return String.valueOf(param.getValue());
    }

    public boolean canBeSent() {
        int i;
        if (this.params.isEmpty() || (i = this.sampleRate) <= 0) {
            return false;
        }
        if (i < 100 && i < this.random.nextInt(100) + 1) {
            return false;
        }
        return true;
    }

    @NonNull
    public Map<String, String> toQuery() {
        return Maps.toMap(Lists.filter(this.params, new Predicate() { // from class: com.smaato.sdk.core.errorreport.a
            @Override // com.smaato.sdk.core.util.p574fi.Predicate
            public final boolean test(Object obj) {
                boolean lambda$toQuery$0;
                lambda$toQuery$0 = Report.lambda$toQuery$0((Param) obj);
                return lambda$toQuery$0;
            }
        }), new Function() { // from class: com.smaato.sdk.core.errorreport.b
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return ((Param) obj).getName();
            }
        }, new Function() { // from class: com.smaato.sdk.core.errorreport.c
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                String lambda$toQuery$1;
                lambda$toQuery$1 = Report.lambda$toQuery$1((Param) obj);
                return lambda$toQuery$1;
            }
        });
    }
}
