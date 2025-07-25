package com.google.zxing;

import java.util.List;

/* loaded from: classes5.dex */
public enum DecodeHintType {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(ResultPointCallback.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    

    /* renamed from: b */
    private final Class<?> f44152b;

    DecodeHintType(Class cls) {
        this.f44152b = cls;
    }

    public Class<?> getValueType() {
        return this.f44152b;
    }
}
