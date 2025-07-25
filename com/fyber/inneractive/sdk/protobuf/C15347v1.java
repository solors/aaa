package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.v1 */
/* loaded from: classes4.dex */
public final class C15347v1 extends AbstractC15353x1 {
    public C15347v1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76704a(Object obj, long j, byte b) {
        if (AbstractC15356y1.f30351h) {
            AbstractC15356y1.m76671a(obj, j, b);
        } else {
            AbstractC15356y1.m76665b(obj, j, b);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: b */
    public final boolean mo76700b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: c */
    public final double mo76698c(Object obj, long j) {
        return Double.longBitsToDouble(this.f30338a.getLong(obj, j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: d */
    public final float mo76697d(Object obj, long j) {
        return Float.intBitsToFloat(this.f30338a.getInt(obj, j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: b */
    public final byte mo76699b(Object obj, long j) {
        if (AbstractC15356y1.f30351h) {
            return AbstractC15356y1.m76672a(obj, j);
        }
        return AbstractC15356y1.m76666b(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final boolean mo76705a(Object obj, long j) {
        return AbstractC15356y1.f30351h ? AbstractC15356y1.m76672a(obj, j) != 0 : AbstractC15356y1.m76666b(obj, j) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76701a(Object obj, long j, boolean z) {
        if (AbstractC15356y1.f30351h) {
            AbstractC15356y1.m76671a(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC15356y1.m76665b(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76702a(Object obj, long j, float f) {
        this.f30338a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76703a(Object obj, long j, double d) {
        this.f30338a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final byte mo76707a(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76706a(long j, byte[] bArr, long j2) {
        throw new UnsupportedOperationException();
    }
}
