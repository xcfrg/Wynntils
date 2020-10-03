package com.wynntils.modules.richpresence.discordgamesdk;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.TypeMapper;
import com.sun.jna.ptr.IntByReference;
import com.wynntils.modules.richpresence.discordgamesdk.enums.EDiscordResult;
import com.wynntils.modules.richpresence.discordgamesdk.options.DiscordGameSDKOptions;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 561</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordStorageManager extends Structure {

    public static final TypeMapper TYPE_MAPPER = DiscordGameSDKLibrary.TYPE_MAPPER;

    /** C type : read_callback* */
    public IDiscordStorageManager.read_callback read;
    /** C type : read_async_callback* */
    public IDiscordStorageManager.read_async_callback read_async;
    /** C type : read_async_partial_callback* */
    public IDiscordStorageManager.read_async_partial_callback read_async_partial;
    /** C type : write_callback* */
    public IDiscordStorageManager.write_callback write;
    /** C type : write_async_callback* */
    public IDiscordStorageManager.write_async_callback write_async;
    /** C type : delete__callback* */
    public IDiscordStorageManager.delete__callback delete_;
    /** C type : exists_callback* */
    public IDiscordStorageManager.exists_callback exists;
    /** C type : count_callback* */
    public IDiscordStorageManager.count_callback count;
    /** C type : stat_callback* */
    public IDiscordStorageManager.stat_callback stat;
    /** C type : stat_at_callback* */
    public IDiscordStorageManager.stat_at_callback stat_at;
    /** C type : get_path_callback* */
    public IDiscordStorageManager.get_path_callback get_path;

    public interface read_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, String name, Pointer data, int data_length, IntByReference read);
    };

    /** <i>native declaration : line 563</i> */
    public interface read_async_callback_callback_callback extends Callback, DiscordGameSDKOptions {
        void apply(Pointer callback_data, EDiscordResult result, Pointer data, int data_length);
    };

    public interface read_async_callback extends Callback, DiscordGameSDKOptions {
        void apply(IDiscordStorageManager manager, String name, Pointer callback_data, IDiscordStorageManager.read_async_callback_callback_callback callback);
    };

    /** <i>native declaration : line 564</i> */
    public interface read_async_partial_callback_callback_callback extends Callback, DiscordGameSDKOptions {
        void apply(Pointer callback_data, EDiscordResult result, Pointer data, int data_length);
    };

    public interface read_async_partial_callback extends Callback, DiscordGameSDKOptions {
        void apply(IDiscordStorageManager manager, String name, long offset, long length, Pointer callback_data, IDiscordStorageManager.read_async_partial_callback_callback_callback callback);
    };

    public interface write_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, String name, Pointer data, int data_length);
    };

    /** <i>native declaration : line 566</i> */
    public interface write_async_callback_callback_callback extends Callback, DiscordGameSDKOptions {
        void apply(Pointer callback_data, EDiscordResult result);
    };

    public interface write_async_callback extends Callback, DiscordGameSDKOptions {
        void apply(IDiscordStorageManager manager, String name, Pointer data, int data_length, Pointer callback_data, IDiscordStorageManager.write_async_callback_callback_callback callback);
    };

    public interface delete__callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, String name);
    };

    public interface exists_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, String name, Pointer exists);
    };

    public interface count_callback extends Callback, DiscordGameSDKOptions {
        void apply(IDiscordStorageManager manager, IntByReference count);
    };

    public interface stat_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, String name, DiscordFileStat stat);
    };

    public interface stat_at_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, int index, DiscordFileStat stat);
    };

    public interface get_path_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordStorageManager manager, Pointer path);
    };

    public IDiscordStorageManager() {
        super();
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("read", "read_async", "read_async_partial", "write", "write_async", "delete_", "exists", "count", "stat", "stat_at", "get_path");
    }

    public IDiscordStorageManager(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends IDiscordStorageManager implements Structure.ByReference {

    };

    public static class ByValue extends IDiscordStorageManager implements Structure.ByValue {

    };
}
