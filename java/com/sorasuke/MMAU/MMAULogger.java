package com.sorasuke.MMAU;


import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MMAULogger {

    private static org.apache.logging.log4j.Logger logger;

    public static void registry(FMLPreInitializationEvent e) {
        logger = e.getModLog();
    }

    public static void log(String s) {
        logger.log(org.apache.logging.log4j.Level.OFF, s);
    } //タダのログ

    public static void info(String s) {
        logger.info(s);
    } //情報

    public static void debug(String s) {
        logger.debug(s);
    } //デバッグ用

    public static void warn(String s) {
        logger.warn(s);
    } //警告

    public static void error(String s) {
        logger.error(s);
    } //エラー

    public static void fatal(String s) {
        logger.fatal(s);
    } //致命的

}
