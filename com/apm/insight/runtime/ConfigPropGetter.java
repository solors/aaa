package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.NpthBus;
import com.apm.insight.entity.Header;

/* renamed from: com.apm.insight.runtime.e */
/* loaded from: classes2.dex */
public class ConfigPropGetter {

    /* renamed from: b */
    private static final ConfigPropGetter f4051b = new ConfigPropGetter() { // from class: com.apm.insight.runtime.e.1

        /* renamed from: a */
        private Header f4053a = null;

        @Override // com.apm.insight.runtime.ConfigPropGetter
        @Nullable
        /* renamed from: b */
        public final Object mo101410b(String str) {
            if (this.f4053a == null) {
                this.f4053a = Header.m101977b(NpthBus.m102011g());
            }
            return this.f4053a.m101969f().opt(str);
        }
    };

    /* renamed from: a */
    private ConfigPropGetter f4052a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConfigPropGetter() {
        this(f4051b);
    }

    @Nullable
    /* renamed from: a */
    public Object mo101411a(String str) {
        ConfigPropGetter configPropGetter = this.f4052a;
        if (configPropGetter != null) {
            return configPropGetter.mo101411a(str);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public Object mo101410b(String str) {
        ConfigPropGetter configPropGetter = this.f4052a;
        if (configPropGetter != null) {
            return configPropGetter.mo101410b(str);
        }
        return null;
    }

    private ConfigPropGetter(ConfigPropGetter configPropGetter) {
        this.f4052a = configPropGetter;
    }
}
