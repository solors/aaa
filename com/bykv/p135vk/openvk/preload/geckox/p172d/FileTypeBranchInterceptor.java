package com.bykv.p135vk.openvk.preload.geckox.p172d;

import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.p163b.BranchInterceptor;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.a */
/* loaded from: classes3.dex */
public class FileTypeBranchInterceptor extends BranchInterceptor<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.BranchInterceptor
    /* renamed from: a */
    protected final /* synthetic */ String mo91323a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType != 0) {
            if (packageType == 1) {
                return "branch_single_file";
            }
            throw new RuntimeException("unknow file type: ".concat(String.valueOf(packageType)));
        }
        return "branch_zip";
    }
}
