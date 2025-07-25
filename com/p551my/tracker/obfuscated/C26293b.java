package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.p551my.tracker.obfuscated.C26293b;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.b */
/* loaded from: classes7.dex */
public final class C26293b {

    /* renamed from: a */
    final IapClient f68501a;

    /* renamed from: b */
    final Context f68502b;

    /* renamed from: c */
    final InterfaceC26296c f68503c;

    /* renamed from: d */
    Set<C26297d> f68504d;

    /* renamed from: com.my.tracker.obfuscated.b$b */
    /* loaded from: classes7.dex */
    public static final class C26295b {

        /* renamed from: a */
        final IapClient f68505a;

        /* renamed from: b */
        final Context f68506b;

        C26295b(IapClient iapClient, Context context) {
            this.f68505a = iapClient;
            this.f68506b = context;
        }

        /* renamed from: a */
        public C26293b m42138a(InterfaceC26296c interfaceC26296c) {
            return new C26293b(this.f68505a, interfaceC26296c, this.f68506b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC26296c {
        /* renamed from: b */
        void mo42115b(List<C26308d> list);

        /* renamed from: c */
        void mo42113c(List<C26308d> list);
    }

    /* renamed from: com.my.tracker.obfuscated.b$d */
    /* loaded from: classes7.dex */
    public final class C26297d implements OnSuccessListener<OwnedPurchasesResult> {

        /* renamed from: a */
        final int f68507a;

        /* renamed from: b */
        final int f68508b;

        /* renamed from: c */
        final List<String> f68509c = Collections.synchronizedList(new ArrayList());

        /* renamed from: d */
        final List<String> f68510d = Collections.synchronizedList(new ArrayList());

        /* renamed from: e */
        String f68511e;

        public C26297d(int i, int i2) {
            C26293b.this = r1;
            this.f68507a = i;
            this.f68508b = i2;
            C26468z0.m41528a("OwnedPurchaseLoader: loader created");
        }

        /* renamed from: a */
        public static /* synthetic */ void m42136a(C26297d c26297d, String str) {
            c26297d.m42134a(str);
        }

        /* renamed from: b */
        public static /* synthetic */ void m42132b(C26297d c26297d, OwnedPurchasesResult ownedPurchasesResult) {
            c26297d.m42137a(ownedPurchasesResult);
        }

        /* renamed from: a */
        public /* synthetic */ void m42137a(OwnedPurchasesResult ownedPurchasesResult) {
            this.f68509c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.f68510d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                C26468z0.m41528a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                m42131b(continuationToken);
            } else if (this.f68509c.isEmpty()) {
                C26468z0.m41528a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.f68508b + " priceType is " + this.f68507a);
                C26293b.this.m42142b(this);
            } else if (!this.f68510d.isEmpty()) {
                this.f68511e = ownedPurchasesResult.getSignatureAlgorithm();
                C26293b.this.m42153a(this);
            } else {
                C26468z0.m41528a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.f68508b + " priceType is " + this.f68507a);
                C26293b.this.m42142b(this);
            }
        }

        /* renamed from: b */
        public void onSuccess(final OwnedPurchasesResult ownedPurchasesResult) {
            C26325g.m42073a(new Runnable() { // from class: com.my.tracker.obfuscated.m1
                @Override // java.lang.Runnable
                public final void run() {
                    C26293b.C26297d.m42132b(C26293b.C26297d.this, ownedPurchasesResult);
                }
            });
        }

        /* renamed from: a */
        private /* synthetic */ void m42135a(Exception exc) {
            C26468z0.m41527a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            C26293b.this.m42142b(this);
        }

        /* renamed from: b */
        void m42131b(final String str) {
            C26325g.m42071c(new Runnable() { // from class: com.my.tracker.obfuscated.n1
                @Override // java.lang.Runnable
                public final void run() {
                    C26293b.C26297d.m42136a(C26293b.C26297d.this, str);
                }
            });
        }

        /* renamed from: a */
        public /* synthetic */ void m42134a(String str) {
            Task obtainOwnedPurchaseRecord;
            C26468z0.m41528a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.f68507a);
            ownedPurchasesReq.setContinuationToken(str);
            int i = this.f68508b;
            if (i == 2) {
                obtainOwnedPurchaseRecord = C26293b.this.f68501a.obtainOwnedPurchases(ownedPurchasesReq);
            } else if (i != 3) {
                C26468z0.m41528a("OwnedPurchaseLoader: invalid source to load purchases");
                C26293b.this.m42142b(this);
                return;
            } else {
                obtainOwnedPurchaseRecord = C26293b.this.f68501a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            obtainOwnedPurchaseRecord.addOnFailureListener(new OnFailureListener() { // from class: com.my.tracker.obfuscated.o1
            });
            obtainOwnedPurchaseRecord.addOnSuccessListener(this);
        }
    }

    private C26293b(IapClient iapClient, InterfaceC26296c interfaceC26296c, Context context) {
        this.f68501a = iapClient;
        this.f68503c = interfaceC26296c;
        this.f68502b = context;
        C26468z0.m41528a("AppGalleryHelper AppGalleryHelper created");
    }

    /* renamed from: a */
    public static /* synthetic */ void m42152a(C26293b c26293b, Intent intent) {
        c26293b.m42143b(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m42141b(C26293b c26293b, Exception exc, List list) {
        c26293b.m42151a(exc, list);
    }

    /* renamed from: c */
    public static /* synthetic */ void m42140c(C26293b c26293b, ProductInfoResult productInfoResult, List list) {
        c26293b.m42154a(productInfoResult, list);
    }

    /* renamed from: d */
    public static /* synthetic */ void m42139d(C26293b c26293b, ProductInfoReq productInfoReq, List list) {
        c26293b.m42155a(productInfoReq, list);
    }

    /* renamed from: a */
    public static C26295b m42157a(Context context) {
        try {
            return new C26295b(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            C26468z0.m41524b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m42143b(Intent intent) {
        PurchaseResultInfo parsePurchaseResultInfoFromIntent = this.f68501a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.f68503c.mo42115b(Collections.singletonList(C26308d.m42106a(parsePurchaseResultInfoFromIntent.getInAppPurchaseData(), parsePurchaseResultInfoFromIntent.getInAppDataSignature(), parsePurchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, C26461y0.m41540a())));
            return;
        }
        C26468z0.m41525b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
    }

    /* renamed from: a */
    static ArrayList<C26308d> m42144a(List<String> list, List<String> list2, String str, int i) {
        ArrayList<C26308d> arrayList = new ArrayList<>();
        long m41540a = C26461y0.m41540a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C26308d m42106a = C26308d.m42106a(list.get(i2), list2.get(i2), str, i, m41540a);
            if (m42106a == null) {
                C26468z0.m41528a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(m42106a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    void m42142b(C26297d c26297d) {
        Set<C26297d> set = this.f68504d;
        if (set == null) {
            C26468z0.m41528a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(c26297d);
        if (set.isEmpty()) {
            this.f68504d = null;
        }
    }

    /* renamed from: a */
    public static JSONObject m42150a(Object obj) {
        C26468z0.m41528a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, productInfo.getProductId());
            jSONObject.put("productName", productInfo.getProductName());
            jSONObject.put("productDesc", productInfo.getProductDesc());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e) {
            C26468z0.m41524b("AppGalleryHelper: ", e);
            return null;
        } catch (Throwable th) {
            C26468z0.m41524b("AppGalleryHelper: ", th);
            return null;
        }
    }

    /* renamed from: a */
    JSONObject m42145a(List<JSONObject> list, String str) {
        String str2;
        if (str == null) {
            str2 = "AppGalleryHelper: can't get product by id, id is null";
        } else if (list != null) {
            for (JSONObject jSONObject : list) {
                try {
                } catch (Throwable th) {
                    C26468z0.m41527a("AppGalleryHelper: error while reading product_id", th);
                }
                if (jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID).equals(str)) {
                    return jSONObject;
                }
            }
            return null;
        } else {
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        }
        C26468z0.m41528a(str2);
        return null;
    }

    /* renamed from: a */
    public void m42158a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new C26297d(0, 2));
        hashSet.add(new C26297d(1, 2));
        hashSet.add(new C26297d(2, 2));
        hashSet.add(new C26297d(0, 3));
        hashSet.add(new C26297d(2, 3));
        this.f68504d = Collections.synchronizedSet(hashSet);
        C26468z0.m41528a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C26297d) it.next()).m42131b((String) null);
        }
    }

    /* renamed from: a */
    public void m42156a(final Intent intent) {
        C26468z0.m41528a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        C26325g.m42071c(new Runnable() { // from class: com.my.tracker.obfuscated.g1
            @Override // java.lang.Runnable
            public final void run() {
                C26293b.m42152a(C26293b.this, intent);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void m42155a(ProductInfoReq productInfoReq, final List list) {
        Task obtainProductInfo = this.f68501a.obtainProductInfo(productInfoReq);
        obtainProductInfo.addOnFailureListener(new OnFailureListener() { // from class: com.my.tracker.obfuscated.j1
        });
        obtainProductInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.my.tracker.obfuscated.k1
        });
    }

    /* renamed from: a */
    public /* synthetic */ void m42154a(ProductInfoResult productInfoResult, List list) {
        List<ProductInfo> productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            C26468z0.m41528a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            for (ProductInfo productInfo : productInfoList) {
                arrayList.add(m42150a(productInfo));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C26308d c26308d = (C26308d) it.next();
                c26308d.m42105a(m42145a(arrayList, c26308d.m42103c()));
            }
        }
        this.f68503c.mo42113c(list);
    }

    /* renamed from: a */
    void m42153a(C26297d c26297d) {
        this.f68503c.mo42115b(m42144a(c26297d.f68509c, c26297d.f68510d, c26297d.f68511e, c26297d.f68508b));
        m42142b(c26297d);
    }

    /* renamed from: a */
    public /* synthetic */ void m42151a(Exception exc, List list) {
        C26468z0.m41527a("AppGalleryHelper: error while loading products ", exc);
        this.f68503c.mo42113c(list);
    }

    /* renamed from: a */
    public void m42149a(List<C26308d> list) {
        C26468z0.m41528a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C26308d c26308d : list) {
            try {
                int i = c26308d.m42101e().getInt("kind");
                if (i == 0) {
                    arrayList.add(c26308d);
                } else if (i == 1) {
                    arrayList2.add(c26308d);
                } else if (i == 2) {
                    arrayList3.add(c26308d);
                }
            } catch (Throwable th) {
                C26468z0.m41524b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            m42148a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            m42148a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            m42148a(arrayList3, 2);
        }
    }

    /* renamed from: a */
    void m42148a(List<C26308d> list, int i) {
        C26468z0.m41528a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        Iterator<C26308d> it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            C26308d next = it.next();
            hashSet.add(next.m42103c());
            arrayList.add(next);
            it.remove();
        }
        C26468z0.m41528a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            C26308d next2 = it.next();
            if (hashSet.contains(next2.m42103c())) {
                arrayList.add(next2);
                it.remove();
            }
        }
        C26468z0.m41528a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            C26468z0.m41528a("AppGalleryHelper: there are still unloaded products, we are loading more");
            m42148a(list, i);
        }
        final ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        C26325g.m42071c(new Runnable() { // from class: com.my.tracker.obfuscated.i1
            @Override // java.lang.Runnable
            public final void run() {
                C26293b.m42139d(C26293b.this, productInfoReq, arrayList);
            }
        });
    }

    /* renamed from: a */
    private /* synthetic */ void m42147a(final List list, final ProductInfoResult productInfoResult) {
        C26325g.m42073a(new Runnable() { // from class: com.my.tracker.obfuscated.h1
            @Override // java.lang.Runnable
            public final void run() {
                C26293b.m42140c(C26293b.this, productInfoResult, list);
            }
        });
    }

    /* renamed from: a */
    private /* synthetic */ void m42146a(final List list, final Exception exc) {
        C26325g.m42073a(new Runnable() { // from class: com.my.tracker.obfuscated.l1
            @Override // java.lang.Runnable
            public final void run() {
                C26293b.m42141b(C26293b.this, exc, list);
            }
        });
    }
}
