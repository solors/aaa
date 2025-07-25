package com.maticoo.sdk.video.p407vo;

import android.text.TextUtils;

/* renamed from: com.maticoo.sdk.video.vo.CreativeVO */
/* loaded from: classes6.dex */
public class CreativeVO {
    public String cid;
    private int height;
    private String path;
    private int playTime;
    private int status;
    private CreativeType type;
    private String url;
    private int width;

    /* renamed from: com.maticoo.sdk.video.vo.CreativeVO$CreativeType */
    /* loaded from: classes6.dex */
    public enum CreativeType {
        jpg,
        mp4,
        unknown;

        public static boolean contains(String str) {
            for (CreativeType creativeType : values()) {
                if (str.equals(creativeType.name())) {
                    return true;
                }
            }
            return false;
        }

        public static CreativeType getType(String str) {
            if (!TextUtils.isEmpty(str) && contains(str)) {
                return valueOf(str);
            }
            return unknown;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CreativeVO) {
            return this.cid.equals(((CreativeVO) obj).cid);
        }
        return false;
    }

    public String getCid() {
        return this.cid;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPath() {
        return this.path;
    }

    public int getPlayTime() {
        return this.playTime;
    }

    public int getStatus() {
        return this.status;
    }

    public CreativeType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPlayTime(int i) {
        this.playTime = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(CreativeType creativeType) {
        this.type = creativeType;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "CreativeVO{cid='" + this.cid + "', url='" + this.url + "', type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", path='" + this.path + "', playTime=" + this.playTime + ", status=" + this.status + '}';
    }
}
