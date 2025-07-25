package com.iabtcf.utils;

import java.util.EnumMap;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class LengthOffsetCache {
    private final BitReader bbv;
    private final EnumMap<FieldDefs, Integer> lengthCache = new EnumMap<>(FieldDefs.class);
    private final EnumMap<FieldDefs, Integer> offsetCache = new EnumMap<>(FieldDefs.class);

    public LengthOffsetCache(BitReader bitReader) {
        this.bbv = bitReader;
    }

    private Integer memoize(FieldDefs fieldDefs, EnumMap<FieldDefs, Integer> enumMap, Function<BitReader, Integer> function) {
        if (!fieldDefs.isDynamic()) {
            return function.apply(this.bbv);
        }
        Integer num = enumMap.get(fieldDefs);
        if (num == null) {
            Integer apply = function.apply(this.bbv);
            enumMap.put((EnumMap<FieldDefs, Integer>) fieldDefs, (FieldDefs) apply);
            return apply;
        }
        return num;
    }

    public Integer getLength(FieldDefs fieldDefs, Function<BitReader, Integer> function) {
        return memoize(fieldDefs, this.lengthCache, function);
    }

    public Integer getOffset(FieldDefs fieldDefs, Function<BitReader, Integer> function) {
        return memoize(fieldDefs, this.offsetCache, function);
    }
}
