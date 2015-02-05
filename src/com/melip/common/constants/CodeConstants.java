package com.melip.common.constants;

/**
 * コードの定数定義用クラスです。
 */
public class CodeConstants {

  /**
   * コンストラクタ<br>
   * インスタンス化できません。
   */
  private CodeConstants() {}

  /** ステータス：有効 {@value} */
  public static final String CODE_STS_VALID = "val";
  /** ステータス：無効 {@value} */
  public static final String CODE_STS_INVALID = "inval";
  /** ステータス：削除 {@value} */
  public static final String CODE_STS_DELETED = "del";
  /** 言語区分：共通 {@value} */
  public static final String CODE_LANG_DIV_COMMON = "common";
  /** 言語区分：共通 {@value} */
  public static final String CODE_LANG_DIV_JAPANESE = "ja";
  /** 言語区分：共通 {@value} */
  public static final String CODE_LANG_DIV_ENGLISH = "en";
  /** エンティティ：地域 {@value} */
  public static final String CODE_ENTITY_REGION = "reg";
  /** エンティティ：施設 {@value} */
  public static final String CODE_ENTITY_FACILITY = "fac";
  /** エンティティ：施設グループ {@value} */
  public static final String CODE_ENTITY_FACILITY_GROUP = "facgrp";
  /** エンティティ：施設_施設グループ_リンク {@value} */
  public static final String CODE_ENTITY_FACILITY_FACILITY_GROUP_LINK = "facgrpln";

}
