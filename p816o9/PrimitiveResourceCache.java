package p816o9;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: o9.b */
/* loaded from: classes8.dex */
public final class PrimitiveResourceCache extends ResourcesWrapper {
    @NotNull

    /* renamed from: b */
    private final ConcurrentHashMap<Integer, Boolean> f102741b;
    @NotNull

    /* renamed from: c */
    private final ConcurrentHashMap<Integer, Float> f102742c;
    @NotNull

    /* renamed from: d */
    private final ConcurrentHashMap<Integer, Integer> f102743d;
    @NotNull

    /* renamed from: e */
    private final ConcurrentHashMap<Integer, Integer> f102744e;
    @NotNull

    /* renamed from: f */
    private final ConcurrentHashMap<Integer, Integer> f102745f;
    @Nullable

    /* renamed from: g */
    private TypedValue f102746g;
    @NotNull

    /* renamed from: h */
    private final Object f102747h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveResourceCache(@NotNull Resources baseResources) {
        super(baseResources);
        Intrinsics.checkNotNullParameter(baseResources, "baseResources");
        this.f102741b = new ConcurrentHashMap<>();
        this.f102742c = new ConcurrentHashMap<>();
        this.f102743d = new ConcurrentHashMap<>();
        this.f102744e = new ConcurrentHashMap<>();
        this.f102745f = new ConcurrentHashMap<>();
        this.f102746g = new TypedValue();
        this.f102747h = new Object();
    }

    /* renamed from: a */
    private final TypedValue m13913a() {
        TypedValue typedValue;
        synchronized (this.f102747h) {
            typedValue = this.f102746g;
            if (typedValue != null) {
                this.f102746g = null;
            } else {
                typedValue = null;
            }
            Unit unit = Unit.f99208a;
        }
        if (typedValue == null) {
            return new TypedValue();
        }
        return typedValue;
    }

    /* renamed from: b */
    private final void m13912b(TypedValue typedValue) {
        synchronized (this.f102747h) {
            if (this.f102746g == null) {
                this.f102746g = typedValue;
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        boolean z;
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.f102741b;
        Boolean it = concurrentHashMap.get(Integer.valueOf(i));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue m13913a = m13913a();
            boolean z2 = true;
            try {
                super.getValue(i, m13913a, true);
                int i2 = m13913a.type;
                if (i2 >= 16 && i2 <= 31) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (m13913a.data == 0) {
                        z2 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    if (m13913a.changingConfigurations == 0) {
                        concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                    }
                    m13912b(m13913a);
                    it = valueOf;
                } else {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m13913a.type) + " is not valid");
                }
            } catch (Throwable th) {
                m13912b(m13913a);
                throw th;
            }
        }
        return it.booleanValue();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.f102742c;
        Float it = concurrentHashMap.get(Integer.valueOf(i));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue m13913a = m13913a();
            boolean z = true;
            try {
                super.getValue(i, m13913a, true);
                if (m13913a.type != 5) {
                    z = false;
                }
                if (z) {
                    Float valueOf = Float.valueOf(TypedValue.complexToDimension(m13913a.data, getDisplayMetrics()));
                    if (m13913a.changingConfigurations == 0) {
                        concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                    }
                    m13912b(m13913a);
                    it = valueOf;
                } else {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m13913a.type) + " is not valid");
                }
            } catch (Throwable th) {
                m13912b(m13913a);
                throw th;
            }
        }
        return it.floatValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f102743d;
        Integer it = concurrentHashMap.get(Integer.valueOf(i));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue m13913a = m13913a();
            boolean z = true;
            try {
                super.getValue(i, m13913a, true);
                if (m13913a.type != 5) {
                    z = false;
                }
                if (z) {
                    Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(m13913a.data, getDisplayMetrics()));
                    if (m13913a.changingConfigurations == 0) {
                        concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                    }
                    m13912b(m13913a);
                    it = valueOf;
                } else {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m13913a.type) + " is not valid");
                }
            } catch (Throwable th) {
                m13912b(m13913a);
                throw th;
            }
        }
        return it.intValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f102744e;
        Integer it = concurrentHashMap.get(Integer.valueOf(i));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue m13913a = m13913a();
            boolean z = true;
            try {
                super.getValue(i, m13913a, true);
                if (m13913a.type != 5) {
                    z = false;
                }
                if (z) {
                    Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(m13913a.data, getDisplayMetrics()));
                    if (m13913a.changingConfigurations == 0) {
                        concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                    }
                    m13912b(m13913a);
                    it = valueOf;
                } else {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m13913a.type) + " is not valid");
                }
            } catch (Throwable th) {
                m13912b(m13913a);
                throw th;
            }
        }
        return it.intValue();
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f102745f;
        Integer it = concurrentHashMap.get(Integer.valueOf(i));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue m13913a = m13913a();
            boolean z = true;
            try {
                super.getValue(i, m13913a, true);
                int i2 = m13913a.type;
                if (i2 < 16 || i2 > 31) {
                    z = false;
                }
                if (z) {
                    Integer valueOf = Integer.valueOf(m13913a.data);
                    if (m13913a.changingConfigurations == 0) {
                        concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf);
                    }
                    m13912b(m13913a);
                    it = valueOf;
                } else {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m13913a.type) + " is not valid");
                }
            } catch (Throwable th) {
                m13912b(m13913a);
                throw th;
            }
        }
        return it.intValue();
    }
}
