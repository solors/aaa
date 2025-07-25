package com.google.firebase.components;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes4.dex */
public final class Dependency {

    /* renamed from: a */
    private final Qualified<?> f42113a;

    /* renamed from: b */
    private final int f42114b;

    /* renamed from: c */
    private final int f42115c;

    private Dependency(Class<?> cls, int i, int i2) {
        this(Qualified.unqualified(cls), i, i2);
    }

    /* renamed from: a */
    private static String m67329a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        return DevicePublicKeyStringDef.DIRECT;
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (!this.f42113a.equals(dependency.f42113a) || this.f42114b != dependency.f42114b || this.f42115c != dependency.f42115c) {
            return false;
        }
        return true;
    }

    public Qualified<?> getInterface() {
        return this.f42113a;
    }

    public int hashCode() {
        return ((((this.f42113a.hashCode() ^ 1000003) * 1000003) ^ this.f42114b) * 1000003) ^ this.f42115c;
    }

    public boolean isDeferred() {
        if (this.f42115c == 2) {
            return true;
        }
        return false;
    }

    public boolean isDirectInjection() {
        if (this.f42115c == 0) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        if (this.f42114b == 1) {
            return true;
        }
        return false;
    }

    public boolean isSet() {
        if (this.f42114b == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f42113a);
        sb2.append(", type=");
        int i = this.f42114b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(m67329a(this.f42115c));
        sb2.append("}");
        return sb2.toString();
    }

    private Dependency(Qualified<?> qualified, int i, int i2) {
        this.f42113a = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.f42114b = i;
        this.f42115c = i2;
    }

    public static Dependency deferred(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency optionalProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency required(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency requiredProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency setOf(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }
}
