package com.learnings.purchase.amazon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.ProductDataManager;
import com.learnings.purchase.PurchaseCallbackManager;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseError;
import com.learnings.purchase.PurchaseInitParameter;
import com.learnings.purchase.PurchaseLogUtil;
import com.learnings.purchase.amazon.listener.AmazonBuyListener;
import com.learnings.purchase.amazon.listener.AmazonProductListener;
import com.learnings.purchase.amazon.listener.AmazonPurchaseListener;
import com.learnings.purchase.amazon.listener.AmazonUserDataListener;
import com.learnings.purchase.listener.BuyCallback;
import com.learnings.purchase.listener.ConnectedCallback;
import com.learnings.purchase.listener.ProductDataListener;
import com.learnings.purchase.listener.PurchaseDataListener;
import com.learnings.purchase.restore.PurchaseRestoreManager;
import com.learnings.purchase.restore.p404db.RestorePurchaseEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class AmazonClient {
    private static final String TAG = "Purchase_AmazonClient";
    private volatile boolean isAddListener;
    private volatile boolean isInitFail;
    private volatile boolean isInitSuccess;
    private final AmazonServiceProxy mAmazonService;
    private ConnectedCallback mConnectedCallback;
    private int mInitRetryAttempt;
    private final Handler mInitRetryHandler;
    private UserData mUserData;

    /* loaded from: classes6.dex */
    public static class Holder {
        private static final AmazonClient singleton = new AmazonClient();

        private Holder() {
        }
    }

    public void dealHistoryPurchase(List<PurchaseData> list) {
        for (PurchaseData purchaseData : list) {
            this.mAmazonService.notifyFulfillment(purchaseData.getToken());
            if (((Receipt) purchaseData.getSourceData()).getProductType() == ProductType.CONSUMABLE) {
                PurchaseRestoreManager.get().restorePurchase(purchaseData);
            }
        }
    }

    public static AmazonClient get() {
        return Holder.singleton;
    }

    /* renamed from: innerQueryProduct */
    public void lambda$reQueryProduct$0(final PurchaseInitParameter purchaseInitParameter) {
        final ArrayList arrayList = new ArrayList();
        if (purchaseInitParameter.getConsumableProductList() != null) {
            arrayList.addAll(purchaseInitParameter.getConsumableProductList());
        }
        if (purchaseInitParameter.getEntitledProductList() != null) {
            arrayList.addAll(purchaseInitParameter.getEntitledProductList());
        }
        if (purchaseInitParameter.getSubscriptionProductList() != null) {
            arrayList.addAll(purchaseInitParameter.getSubscriptionProductList());
        }
        this.mAmazonService.getUserData(new AmazonUserDataListener() { // from class: com.learnings.purchase.amazon.AmazonClient.1
            {
                AmazonClient.this = this;
            }

            @Override // com.learnings.purchase.amazon.listener.AmazonUserDataListener
            public void onFail(PurchaseError purchaseError) {
                PurchaseLogUtil.log(AmazonClient.TAG, "innerQueryProduct getUserData onFail: " + purchaseError);
                AmazonClient.this.notifyInitFail(purchaseError);
                AmazonClient.this.reQueryProduct(purchaseInitParameter);
            }

            @Override // com.learnings.purchase.amazon.listener.AmazonUserDataListener
            public void onSuccess(UserData userData) {
                AmazonClient.this.mUserData = userData;
                PurchaseLogUtil.log(AmazonClient.TAG, "innerQueryProduct getUserData onSuccess: " + AmazonClient.this.mUserData);
                AmazonClient.this.queryProduct(arrayList, new ProductDataListener() { // from class: com.learnings.purchase.amazon.AmazonClient.1.1
                    {
                        C213851.this = this;
                    }

                    @Override // com.learnings.purchase.listener.ProductDataListener
                    public void onFail(PurchaseError purchaseError) {
                        PurchaseLogUtil.log(AmazonClient.TAG, "innerQueryProduct onFail: " + purchaseError);
                        AmazonClient.this.notifyInitFail(purchaseError);
                        C213851 c213851 = C213851.this;
                        AmazonClient.this.reQueryProduct(purchaseInitParameter);
                    }

                    @Override // com.learnings.purchase.listener.ProductDataListener
                    public void onSuccess(List<ProductData> list) {
                        PurchaseLogUtil.log(AmazonClient.TAG, "innerQueryProduct onSuccess: " + list.size());
                        AmazonClient.this.notifyInitSuccess();
                    }
                });
            }
        });
    }

    public void notifyInitFail(PurchaseError purchaseError) {
        if (this.isInitFail) {
            return;
        }
        this.isInitFail = true;
        ConnectedCallback connectedCallback = this.mConnectedCallback;
        if (connectedCallback != null) {
            connectedCallback.onFail(purchaseError);
        }
    }

    public void notifyInitSuccess() {
        if (this.isInitSuccess) {
            return;
        }
        this.isInitSuccess = true;
        ConnectedCallback connectedCallback = this.mConnectedCallback;
        if (connectedCallback != null) {
            connectedCallback.onSuccess();
        }
    }

    public void reQueryProduct(final PurchaseInitParameter purchaseInitParameter) {
        PurchaseLogUtil.log(TAG, "reQueryProduct");
        int i = this.mInitRetryAttempt + 1;
        this.mInitRetryAttempt = i;
        this.mInitRetryHandler.postDelayed(new Runnable() { // from class: com.learnings.purchase.amazon.a
            {
                AmazonClient.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AmazonClient.this.lambda$reQueryProduct$0(purchaseInitParameter);
            }
        }, TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, Math.min(8, i))));
    }

    public void addPurchaseListener(Context context) {
        if (this.isAddListener) {
            PurchaseLogUtil.log(TAG, "has addPurchaseListener");
            return;
        }
        this.isAddListener = true;
        PurchaseLogUtil.log(TAG, "addPurchaseListener");
        PurchasingService.registerListener(context.getApplicationContext(), this.mAmazonService);
    }

    public void buy(String str, final BuyCallback buyCallback) {
        this.mAmazonService.buy(str, new AmazonBuyListener() { // from class: com.learnings.purchase.amazon.AmazonClient.4
            {
                AmazonClient.this = this;
            }

            @Override // com.learnings.purchase.amazon.listener.AmazonBuyListener
            public void onFail(PurchaseError purchaseError) {
                BuyCallback buyCallback2 = buyCallback;
                if (buyCallback2 != null) {
                    buyCallback2.onFail(purchaseError);
                }
            }

            @Override // com.learnings.purchase.amazon.listener.AmazonBuyListener
            public void onSuccess(Receipt receipt) {
                PurchaseData generate = AmazonDataHelper.generate(receipt);
                BuyCallback buyCallback2 = buyCallback;
                if (buyCallback2 != null) {
                    buyCallback2.onSuccess(generate);
                }
                PurchaseCallbackManager.get().onSuccess(generate);
                AmazonClient.this.mAmazonService.notifyFulfillment(generate.getToken());
                if (receipt.getProductType() == ProductType.CONSUMABLE) {
                    PurchaseRestoreManager.get().savePurchase(generate, RestorePurchaseEntity.RESTORE_TYPE_CONSUMABLE);
                }
            }
        });
    }

    public void init(PurchaseInitParameter purchaseInitParameter, ConnectedCallback connectedCallback) {
        this.mConnectedCallback = connectedCallback;
        addPurchaseListener(purchaseInitParameter.getContext());
        lambda$reQueryProduct$0(purchaseInitParameter);
    }

    public void queryProduct(List<String> list, final ProductDataListener productDataListener) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Map.Entry<String, ProductData> entry : ProductDataManager.get().getAllProductData().entrySet()) {
                for (String str : list) {
                    if (TextUtils.equals(entry.getKey(), str)) {
                        arrayList.add(entry.getValue());
                    }
                }
            }
            if (arrayList.size() == list.size()) {
                PurchaseLogUtil.log(TAG, "queryProductDetails use memory cache：" + list);
                if (productDataListener != null) {
                    productDataListener.onSuccess(arrayList);
                    return;
                }
                return;
            }
            this.mAmazonService.queryProduct(new HashSet(list), new AmazonProductListener() { // from class: com.learnings.purchase.amazon.AmazonClient.2
                {
                    AmazonClient.this = this;
                }

                @Override // com.learnings.purchase.amazon.listener.AmazonProductListener
                public void onFail(PurchaseError purchaseError) {
                    ProductDataListener productDataListener2 = productDataListener;
                    if (productDataListener2 != null) {
                        productDataListener2.onFail(purchaseError);
                    }
                }

                @Override // com.learnings.purchase.amazon.listener.AmazonProductListener
                public void onSuccess(Map<String, Product> map) {
                    List<ProductData> generate = AmazonDataHelper.generate(map, AmazonClient.this.mUserData);
                    PurchaseLogUtil.log(AmazonClient.TAG, "queryProductDetails onSuccess：\n" + generate);
                    for (ProductData productData : generate) {
                        ProductDataManager.get().updateProduct(productData.getProductId(), productData);
                    }
                    ProductDataListener productDataListener2 = productDataListener;
                    if (productDataListener2 != null) {
                        productDataListener2.onSuccess(generate);
                    }
                }
            });
            return;
        }
        PurchaseLogUtil.log(TAG, "queryProductDetails productIdList is empty");
        if (productDataListener != null) {
            productDataListener.onSuccess(arrayList);
        }
    }

    public void queryPurchases(final PurchaseDataListener purchaseDataListener) {
        if (!this.isInitSuccess) {
            PurchaseLogUtil.log(TAG, "queryPurchases SERVICE_UNAVAILABLE");
            if (purchaseDataListener != null) {
                purchaseDataListener.onFail(AmazonPurchaseError.get(1002));
                return;
            }
            return;
        }
        this.mAmazonService.queryPurchases(new AmazonPurchaseListener() { // from class: com.learnings.purchase.amazon.AmazonClient.3
            {
                AmazonClient.this = this;
            }

            @Override // com.learnings.purchase.amazon.listener.AmazonPurchaseListener
            public void onFail(PurchaseError purchaseError) {
                PurchaseLogUtil.log(AmazonClient.TAG, "queryPurchases onFail：" + purchaseError);
                PurchaseDataListener purchaseDataListener2 = purchaseDataListener;
                if (purchaseDataListener2 != null) {
                    purchaseDataListener2.onFail(purchaseError);
                }
            }

            @Override // com.learnings.purchase.amazon.listener.AmazonPurchaseListener
            public void onSuccess(List<Receipt> list) {
                List<PurchaseData> generate = AmazonDataHelper.generate(list);
                PurchaseLogUtil.log(AmazonClient.TAG, "queryPurchases onSuccess size: " + generate.size());
                PurchaseLogUtil.log(AmazonClient.TAG, "queryPurchases onSuccess：\n" + generate);
                PurchaseDataListener purchaseDataListener2 = purchaseDataListener;
                if (purchaseDataListener2 != null) {
                    purchaseDataListener2.onSuccess(generate);
                }
                AmazonClient.this.dealHistoryPurchase(generate);
            }
        });
    }

    private AmazonClient() {
        this.mInitRetryHandler = new Handler(Looper.getMainLooper());
        this.mAmazonService = new AmazonServiceProxy();
    }
}
