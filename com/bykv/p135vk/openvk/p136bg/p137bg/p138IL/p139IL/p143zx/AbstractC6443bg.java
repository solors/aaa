package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx;

import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6388WR;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC6443bg {

    /* renamed from: IL */
    C6446zx f13441IL;

    /* renamed from: bg */
    List<C6388WR.C6389IL> f13442bg;

    /* renamed from: IL */
    public abstract boolean mo91942IL();

    /* renamed from: bX */
    public abstract List<C6388WR.C6389IL> mo91941bX();

    /* renamed from: bg */
    public abstract int mo91940bg();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public String m91946bg(int i) {
        switch (i) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case 407:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Time-Out";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case 411:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case 413:
                                return "Request Entity Too Large";
                            case 414:
                                return "Request-URI Too Large";
                            case 415:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    /* renamed from: bg */
    public abstract String mo91939bg(String str, String str2);

    public abstract InputStream eqN();

    /* renamed from: iR */
    public C6446zx m91944iR() {
        return this.f13441IL;
    }

    public abstract String ldr();

    /* renamed from: zx */
    public abstract String mo91938zx();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public C6388WR.C6389IL m91945bg(String str) {
        List<C6388WR.C6389IL> list;
        if (str != null && (list = this.f13442bg) != null && list.size() > 0) {
            for (C6388WR.C6389IL c6389il : this.f13442bg) {
                if (str.equals(c6389il.f13323bg)) {
                    return c6389il;
                }
            }
        }
        return null;
    }
}
