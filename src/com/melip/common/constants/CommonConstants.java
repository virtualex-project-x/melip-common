package com.melip.common.constants;

/**
 * 共通の定数定義用クラスです。
 */
public class CommonConstants {

  /**
   * コンストラクタ<br>
   * インスタンス化できません。
   */
  private CommonConstants() {}

  /** システムの文字コード {@value} */
  public static final String SYSTEM_CHARSET = "UTF-8";
  /** メディアタイプJSON {@value} */
  public static final String MEDIA_TYPE_JSON = "application/json;charset=" + SYSTEM_CHARSET;

}
