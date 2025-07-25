package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38513v;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.mobilefuse.sdk.identity.ParseEidResponseKt */
/* loaded from: classes7.dex */
public final class ParseEidResponse {
    @NotNull
    public static final Either<BaseError, Tuples<EidDataModel, Set<String>>> applyEidResponseToCurrentEidData(@NotNull EidDataModel currentEidData, @NotNull String requestUserPayload, @NotNull String responseJson) {
        Either errorResult;
        Object value;
        String mfxPayload;
        JSONArray jSONArray;
        Map m17285D;
        JSONArray jSONArray2;
        Intrinsics.checkNotNullParameter(currentEidData, "currentEidData");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        Intrinsics.checkNotNullParameter(responseJson, "responseJson");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            JSONObject jSONObject = new JSONObject(responseJson);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (jSONObject.has("mfx")) {
                mfxPayload = jSONObject.getJSONObject("mfx").toString();
            } else {
                mfxPayload = currentEidData.getMfxPayload();
            }
            String str = mfxPayload;
            JSONObject jSONObject2 = jSONObject.getJSONObject("sdk");
            int i = jSONObject2.getInt("ttl");
            if (jSONObject2.has("del")) {
                jSONArray = jSONObject2.getJSONArray("del");
            } else {
                jSONArray = new JSONArray();
            }
            m17285D = C37559r0.m17285D(currentEidData.getSdkEids());
            if (jSONObject2.has("ids")) {
                jSONArray2 = jSONObject2.getJSONArray("ids");
            } else {
                jSONArray2 = new JSONArray();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                String key = jSONObject3.getString("src");
                String value2 = jSONObject3.getString("id");
                if (!Intrinsics.m17075f(value2, (String) m17285D.get(key))) {
                    linkedHashSet.add(key);
                }
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value2, "value");
                linkedHashMap.put(key, value2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                m17285D.put(entry.getKey(), entry.getValue());
            }
            int length2 = jSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String string = jSONArray.getString(i3);
                if (currentEidData.getSdkEids().containsKey(string)) {
                    linkedHashSet.add(string);
                    m17285D.remove(string);
                }
            }
            errorResult = new SuccessResult(new SuccessResult(C38513v.m14532a(new EidDataModel(System.currentTimeMillis() + (i * 1000), m17285D, str, requestUserPayload), linkedHashSet)));
        } catch (Throwable th) {
            if (C23568x6479dae6.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        } else if (errorResult instanceof SuccessResult) {
            value = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (Either) value;
    }
}
