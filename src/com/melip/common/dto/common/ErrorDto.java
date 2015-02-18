package com.melip.common.dto.common;

import java.util.List;

/**
 * エラー情報を保持するDTOです。
 */
public class ErrorDto extends AbstractDto {

  /** エラーメッセージリストのフィールド名 */
  public static final String FIELD_ERR_MSG_LIST = "errMsgList";

  /** エラーメッセージリスト */
  private List<String> errMsgList;

  /**
   * コンストラクタ
   */
  public ErrorDto() {}

  /**
   * コンストラクタ
   * 
   * @param errMsgList
   */
  public ErrorDto(List<String> errMsgList) {
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
