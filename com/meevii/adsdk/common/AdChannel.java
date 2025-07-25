package com.meevii.adsdk.common;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* loaded from: classes6.dex */
public enum AdChannel {
    NORMAL(0, "normal"),
    GOOGLE(1, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE),
    AMAZON(2, "amazon"),
    YINGYONGBAO(3, "yingyongbao"),
    VIVO(4, "vivo"),
    OPPO(5, "oppo"),
    HUAWEI(6, "huawei"),
    XIAOMI(7, "xiaomi"),
    BAIDU(8, "baidu"),
    SANLIULING(9, "360"),
    ALI(10, "ali"),
    KUAISHOU(11, "kuaishou"),
    TOUTIAO(12, "toutiao"),
    GUANGDIANTONG(13, "guangdiantong"),
    SIGMOB(14, "sigmob"),
    UNITY(15, "unity"),
    BILIBILI(16, "bilibili"),
    DOUYIN(17, "douyin"),
    WANDOUJIA(18, "wandoujia"),
    ANZHI(19, "anzhi"),
    WECHAT(20, "wechat"),
    VUNGLE(21, "vungle");
    
    public int code;
    public String name;

    AdChannel(int i, String str) {
        this.code = i;
        this.name = str;
    }
}
