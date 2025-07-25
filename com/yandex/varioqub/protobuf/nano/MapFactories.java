package com.yandex.varioqub.protobuf.nano;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MapFactories {
    private static volatile MapFactory mapFactory = new DefaultMapFactory();

    /* loaded from: classes8.dex */
    public static class DefaultMapFactory implements MapFactory {
        private DefaultMapFactory() {
        }

        @Override // com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory
        public <K, V> Map<K, V> forMap(Map<K, V> map) {
            if (map == null) {
                return new HashMap();
            }
            return map;
        }
    }

    /* loaded from: classes8.dex */
    public interface MapFactory {
        <K, V> Map<K, V> forMap(Map<K, V> map);
    }

    private MapFactories() {
    }

    public static MapFactory getMapFactory() {
        return mapFactory;
    }

    static void setMapFactory(MapFactory mapFactory2) {
        mapFactory = mapFactory2;
    }
}
