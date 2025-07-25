package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.x1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15353x1 {

    /* renamed from: a */
    public final Unsafe f30338a;

    public AbstractC15353x1(Unsafe unsafe) {
        this.f30338a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo76707a(long j);

    /* renamed from: a */
    public abstract void mo76706a(long j, byte[] bArr, long j2);

    /* renamed from: a */
    public abstract void mo76704a(Object obj, long j, byte b);

    /* renamed from: a */
    public abstract void mo76703a(Object obj, long j, double d);

    /* renamed from: a */
    public abstract void mo76702a(Object obj, long j, float f);

    /* renamed from: a */
    public abstract void mo76701a(Object obj, long j, boolean z);

    /* renamed from: a */
    public boolean mo76708a() {
        Unsafe unsafe = this.f30338a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC15356y1.m76668a(th);
            return false;
        }
    }

    /* renamed from: a */
    public abstract boolean mo76705a(Object obj, long j);

    /* renamed from: b */
    public abstract byte mo76699b(Object obj, long j);

    /* renamed from: b */
    public abstract boolean mo76700b();

    /* renamed from: c */
    public abstract double mo76698c(Object obj, long j);

    /* renamed from: d */
    public abstract float mo76697d(Object obj, long j);
}
