package com.melip.common.dto.common;

import java.util.List;

/**
 * エラー情報を保持するリソースDTOです。
 */
public class ResourceErrorDto extends AbstractResourceDto {

  /** エラーメッセージリストのフィールド名 */
  public static final String FIELD_ERR_MSG_LIST = "errMsgList";

  /** エラーメッセージリスト */
  private List<String> errMsgList;

  /**
   * コンストラクタ
   */
  public ResourceErrorDto() {}

  /**
   * コンストラクタ
   * 
   * @param errMsgList エラーメッセージリスト
   */
  public ResourceErrorDto(List<String> errMsgList) {
    this(null, errMsgList);
  }

  /**
   * コンストラクタ
   * 
   * @param entity エンティティ
   * @param errMsgList エラーメッセージリスト
   */
  public ResourceErrorDto(String entity, List<String> errMsgList) {

    super(entity);
    this.errMsgList = errMsgList;
  }

  /**
   * エラーメッセージリストを取得します。
   * 
   * @return エラーメッセージリスト
   */
  public List<String> getErrMsgList() {
    return errMsgList;
  }

  /**
   * エラーメッセージリストを設定します。
   * 
   * @param errMsgList エラーメッセージリスト
   */
  public void setErrMsgList(List<String> errMsgList) {
    this.errMsgList = errMsgList;
  }

}
