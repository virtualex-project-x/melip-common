package com.melip.common.constants;

/**
 * コードの定数定義用クラスです。
 */
public class CodeConstants {

  /**
   * コンストラクタ
   */
  private CodeConstants() {
    // インスタンス化不可
  }

  /** ステータス：有効 */
  public static final String CODE_STS_VALID = "val";
  /** ステータス：無効 */
  public static final String CODE_STS_INVALID = "inval";
  /** ステータス：削除 */
  public static final String CODE_STS_DELETED = "del";
  /** 言語区分：共通 */
  public static final String CODE_LANG_DIV_COMMON = "common";
  /** 言語区分：共通 */
  public static final String CODE_LANG_DIV_JAPANESE = "ja";
  /** 言語区分：共通 */
  public static final String CODE_LANG_DIV_ENGLISH = "en";
  /** エンティティ：地域 */
  public static final String CODE_ENTITY_REGION = "reg";
  /** エンティティ：施設 */
  public static final String CODE_ENTITY_FACILITY = "fac";
  /** エンティティ：施設グループ */
  public static final String CODE_ENTITY_FACILITY_GROUP = "facgrp";
  /** エンティティ：施設_施設グループ_リンク */
  public static final String CODE_ENTITY_FACILITY_FACILITY_GROUP_LINK = "facgrpln";


}
