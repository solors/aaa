package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes5.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id */
    private final int f44132id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f44132id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f44132id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
