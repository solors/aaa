package com.bykv.p135vk.openvk.preload.p155a;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.bykv.vk.openvk.preload.a.b */
/* loaded from: classes3.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {

    /* renamed from: a */
    public static final FieldNamingPolicy f13595a = new FieldNamingPolicy("IDENTITY") { // from class: com.bykv.vk.openvk.preload.a.b.1
        @Override // com.bykv.p135vk.openvk.preload.p155a.FieldNamingStrategy
        /* renamed from: a */
        public final String mo91570a(Field field) {
            return field.getName();
        }
    };

    /* renamed from: b */
    private static FieldNamingPolicy f13596b = new FieldNamingPolicy("UPPER_CAMEL_CASE") { // from class: com.bykv.vk.openvk.preload.a.b.2
        @Override // com.bykv.p135vk.openvk.preload.p155a.FieldNamingStrategy
        /* renamed from: a */
        public final String mo91570a(Field field) {
            return FieldNamingPolicy.m91663a(field.getName());
        }
    };

    /* renamed from: c */
    private static FieldNamingPolicy f13597c = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES") { // from class: com.bykv.vk.openvk.preload.a.b.3
        @Override // com.bykv.p135vk.openvk.preload.p155a.FieldNamingStrategy
        /* renamed from: a */
        public final String mo91570a(Field field) {
            return FieldNamingPolicy.m91663a(FieldNamingPolicy.m91662a(field.getName(), " "));
        }
    };

    /* renamed from: d */
    private static FieldNamingPolicy f13598d = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES") { // from class: com.bykv.vk.openvk.preload.a.b.4
        @Override // com.bykv.p135vk.openvk.preload.p155a.FieldNamingStrategy
        /* renamed from: a */
        public final String mo91570a(Field field) {
            return FieldNamingPolicy.m91662a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: e */
    private static FieldNamingPolicy f13599e = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES") { // from class: com.bykv.vk.openvk.preload.a.b.5
        @Override // com.bykv.p135vk.openvk.preload.p155a.FieldNamingStrategy
        /* renamed from: a */
        public final String mo91570a(Field field) {
            return FieldNamingPolicy.m91662a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: f */
    private static FieldNamingPolicy f13600f = new FieldNamingPolicy("LOWER_CASE_WITH_DOTS") { // from class: com.bykv.vk.openvk.preload.a.b.6
        @Override // com.bykv.p135vk.openvk.preload.p155a.FieldNamingStrategy
        /* renamed from: a */
        public final String mo91570a(Field field) {
            return FieldNamingPolicy.m91662a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    private FieldNamingPolicy(String str, int i) {
    }

    /* renamed from: a */
    static String m91662a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* synthetic */ FieldNamingPolicy(String str, int i, byte b) {
        this(str, i);
    }

    /* renamed from: a */
    static String m91663a(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
