package androidx.compose.p015ui.autofill;

import androidx.autofill.HintConstants;
import androidx.compose.p015ui.ExperimentalComposeUiApi;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: AndroidAutofillType.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.autofill.AndroidAutofillType_androidKt */
/* loaded from: classes.dex */
public final class AndroidAutofillType_androidKt {
    @NotNull
    private static final HashMap<AutofillType, String> androidAutofillTypes;

    static {
        HashMap<AutofillType, String> m17282l;
        m17282l = C37559r0.m17282l(C38513v.m14532a(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), C38513v.m14532a(AutofillType.Username, "username"), C38513v.m14532a(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), C38513v.m14532a(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), C38513v.m14532a(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), C38513v.m14532a(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), C38513v.m14532a(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), C38513v.m14532a(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), C38513v.m14532a(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), C38513v.m14532a(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), C38513v.m14532a(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), C38513v.m14532a(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), C38513v.m14532a(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), C38513v.m14532a(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), C38513v.m14532a(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), C38513v.m14532a(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), C38513v.m14532a(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), C38513v.m14532a(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), C38513v.m14532a(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), C38513v.m14532a(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), C38513v.m14532a(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), C38513v.m14532a(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), C38513v.m14532a(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), C38513v.m14532a(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), C38513v.m14532a(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), C38513v.m14532a(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), C38513v.m14532a(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), C38513v.m14532a(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), C38513v.m14532a(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), C38513v.m14532a(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), C38513v.m14532a(AutofillType.Gender, "gender"), C38513v.m14532a(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), C38513v.m14532a(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), C38513v.m14532a(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), C38513v.m14532a(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), C38513v.m14532a(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));
        androidAutofillTypes = m17282l;
    }

    @NotNull
    public static final String getAndroidType(@NotNull AutofillType autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "<this>");
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @ExperimentalComposeUiApi
    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
