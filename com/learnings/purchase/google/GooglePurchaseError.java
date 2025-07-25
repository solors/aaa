package com.learnings.purchase.google;

import android.util.SparseArray;
import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public class GooglePurchaseError extends PurchaseError {
    public static final int BILLING_UNAVAILABLE = 3;
    public static final int DEVELOPER_ERROR = 5;
    public static final int ERROR = 6;
    public static final int FEATURE_NOT_SUPPORTED = -2;
    public static final int ITEM_ALREADY_OWNED = 7;
    public static final int ITEM_NOT_OWNED = 8;
    public static final int ITEM_UNAVAILABLE = 4;
    public static final int NETWORK_ERROR = 12;
    public static final int PURCHASE_LIST_EMPTY = 100;
    public static final int PURCHASE_LIST_NOT_CONTAINS_PRODUCT = 200;
    public static final int PURCHASE_PENDING = 400;
    public static final int PURCHASE_UNSPECIFIED_STATE = 300;
    public static final int SERVICE_DISCONNECTED = -1;
    public static final int SERVICE_UNAVAILABLE = 2;
    public static final int USER_CANCELED = 1;
    private static final SparseArray<PurchaseError> sErrorCodeSparseArray;

    static {
        SparseArray<PurchaseError> sparseArray = new SparseArray<>();
        sErrorCodeSparseArray = sparseArray;
        sparseArray.put(-2, new GooglePurchaseError(-2, "FEATURE_NOT_SUPPORTED"));
        sparseArray.put(-1, new GooglePurchaseError(-1, "SERVICE_DISCONNECTED"));
        sparseArray.put(1, new GooglePurchaseError(1, "USER_CANCELED"));
        sparseArray.put(2, new GooglePurchaseError(2, "SERVICE_UNAVAILABLE"));
        sparseArray.put(3, new GooglePurchaseError(3, "BILLING_UNAVAILABLE"));
        sparseArray.put(4, new GooglePurchaseError(4, "ITEM_UNAVAILABLE"));
        sparseArray.put(5, new GooglePurchaseError(5, "DEVELOPER_ERROR"));
        sparseArray.put(6, new GooglePurchaseError(6, "ERROR"));
        sparseArray.put(8, new GooglePurchaseError(8, "ITEM_NOT_OWNED"));
        sparseArray.put(7, new GooglePurchaseError(7, "ITEM_ALREADY_OWNED"));
        sparseArray.put(12, new GooglePurchaseError(12, "NETWORK_ERROR"));
        sparseArray.put(100, new GooglePurchaseError(100, "PURCHASE_LIST_EMPTY"));
        sparseArray.put(200, new GooglePurchaseError(200, "PURCHASE_LIST_NOT_CONTAINS_PRODUCT"));
        sparseArray.put(300, new GooglePurchaseError(300, "PURCHASE_UNSPECIFIED_STATE"));
        sparseArray.put(400, new GooglePurchaseError(400, "PURCHASE_PENDING"));
    }

    protected GooglePurchaseError(int i, String str) {
        super(i, str);
    }

    public static PurchaseError get(int i) {
        PurchaseError purchaseError = sErrorCodeSparseArray.get(i);
        if (purchaseError == null) {
            return new GooglePurchaseError(i, "UNKNOWN");
        }
        return purchaseError;
    }
}
