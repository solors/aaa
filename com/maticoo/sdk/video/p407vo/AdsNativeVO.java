package com.maticoo.sdk.video.p407vo;

import androidx.annotation.Keep;

@Keep
/* renamed from: com.maticoo.sdk.video.vo.AdsNativeVO */
/* loaded from: classes6.dex */
public class AdsNativeVO extends AdsVO {
    public String buttonStr;
    public String choicesLinkUrl;
    public long createTime = System.currentTimeMillis();
    public String desc;
    public String iconFile;
    public String iconUrl;
    public String imageFile;
    public String imageUrl;
    public int offerType;
    public String rate;
    public String title;

    @Override // com.maticoo.sdk.video.p407vo.AdsVO
    public String toString() {
        return super.toString() + " iconUrl" + this.iconUrl + " title" + this.title + " imageUrl" + this.imageUrl + " desc" + this.desc + " buttonStr" + this.buttonStr + " rate" + this.rate + " choicesLinkUrl" + this.choicesLinkUrl + " offerType" + this.offerType + " createTime" + this.createTime;
    }
}
