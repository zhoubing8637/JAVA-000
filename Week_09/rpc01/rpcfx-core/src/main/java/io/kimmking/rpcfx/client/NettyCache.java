package io.kimmking.rpcfx.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NettyCache {
    private static final Map<String, String> CACHE = new ConcurrentHashMap<>(16);

    public static void put(final String key, final String val) {
        CACHE.put(key, val);
    }

    public static String get(final String key) {
        return CACHE.getOrDefault(key, "");
    }

    public static int size(){
        return CACHE.size();
    }
}