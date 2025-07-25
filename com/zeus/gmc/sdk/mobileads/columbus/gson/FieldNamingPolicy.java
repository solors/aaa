package com.zeus.gmc.sdk.mobileads.columbus.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes8.dex */
public enum FieldNamingPolicy implements FieldNamingStrategy {
    IDENTITY { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingPolicy.1
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingPolicy.2
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingPolicy.3
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingPolicy.4
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingPolicy.5
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    private static String modifyString(char c, String str, int i) {
        if (i < str.length()) {
            return c + str.substring(i);
        }
        return String.valueOf(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String separateCamelCase(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String upperCaseFirstLetter(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            sb2.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (i == str.length()) {
            return sb2.toString();
        }
        if (!Character.isUpperCase(charAt)) {
            sb2.append(modifyString(Character.toUpperCase(charAt), str, i + 1));
            return sb2.toString();
        }
        return str;
    }
}
