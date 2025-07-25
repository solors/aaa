package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.text.Char;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SensitiveUserDataUtils.kt */
@Metadata
/* loaded from: classes2.dex */
public final class SensitiveUserDataUtils {
    @NotNull
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView textView) {
        int i;
        int m16760f;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(ViewHierarchy.getTextOfView(textView), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i2 = length - 1;
                if (i2 >= 0) {
                    boolean z = false;
                    i = 0;
                    while (true) {
                        int i3 = i2 - 1;
                        char charAt = replace.charAt(i2);
                        if (Character.isDigit(charAt)) {
                            m16760f = Char.m16760f(charAt);
                            if (z && (m16760f = m16760f * 2) > 9) {
                                m16760f = (m16760f % 10) + 1;
                            }
                            i += m16760f;
                            z = !z;
                            if (i3 < 0) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            return false;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isEmail(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String textOfView = ViewHierarchy.getTextOfView(textView);
            if (textOfView == null) {
                return false;
            }
            if (textOfView.length() != 0) {
                z = false;
            }
            if (z) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPassword(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPersonName(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 96) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPhoneNumber(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPostalAddress(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 112) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isSensitiveUserData(@Nullable View view) {
        if (CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            if (!sensitiveUserDataUtils.isPassword((TextView) view) && !sensitiveUserDataUtils.isCreditCard((TextView) view) && !sensitiveUserDataUtils.isPersonName((TextView) view) && !sensitiveUserDataUtils.isPostalAddress((TextView) view) && !sensitiveUserDataUtils.isPhoneNumber((TextView) view)) {
                if (!sensitiveUserDataUtils.isEmail((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveUserDataUtils.class);
            return false;
        }
    }
}
