package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class InneractiveUserConfig {

    /* renamed from: a */
    public int f27365a = -1;

    /* renamed from: b */
    public Gender f27366b = null;

    /* renamed from: c */
    public String f27367c = null;

    /* loaded from: classes4.dex */
    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i) {
        if (i >= 1 && i <= 120) {
            return true;
        }
        return false;
    }

    public int getAge() {
        return this.f27365a;
    }

    public Gender getGender() {
        return this.f27366b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f27367c;
    }

    public InneractiveUserConfig setAge(int i) {
        if (ageIsValid(i)) {
            this.f27365a = i;
        } else {
            IAlog.m76524f("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        }
        return this;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f27366b = gender;
        } else {
            IAlog.m76524f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str != null && Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            this.f27367c = str;
        } else {
            IAlog.m76527c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        }
        return this;
    }
}
