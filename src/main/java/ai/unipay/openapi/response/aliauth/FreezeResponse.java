package ai.unipay.openapi.response.aliauth;

import ai.unipay.openapi.response.GenerateResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 预授权冻结
 * 用于接收预授权冻结成功后返回的相关信息
 *
 * @author yuzhitao
 * @Date: 2018-07-16
 */
@Data
public class FreezeResponse extends GenerateResponse {
    /**
     * 外部商户授权单号
     * 建议商户外部订单号长度为30-32位
     * 商户支付的订单号由商户自定义生成，订单要求商户订单号保持唯一性（建议根据当前系统时间戳加随机序列来生成订单号）
     */
    @JsonProperty("out_auth_order_no")
    private String outAuthOrderNo;
    /**
     * 商户授权订单号
     * 商户平台生成的授权订单号，用于查询标识本次冻结
     */
    @JsonProperty("auth_order_no")
    private String authOrderNo;
    /**
     * 支付宝授权订单号
     * 支付宝生成的授权订单号，用于查询标识本次冻结
     */
    @JsonProperty("ali_auth_order_no")
    private String aliAuthOrderNo;
    /**
     * 商户授权操作流水号
     * 商户平台生成的操作流水号，用于查询标识本次冻结操作
     */
    @JsonProperty("operation_no")
    private String operationNo;
    /**
     * 支付宝授权操作流水号
     * 支付宝生成的操作流水号，用于查询标识本次冻结操作
     */
    @JsonProperty("ali_operation_no")
    private String aliOperationNo;
    /**
     * 冻结金额
     * 冻结金额，只能为人民币交易，接口中参数支付金额单位为【分】
     */
    @JsonProperty("freeze_amount")
    private String freezeAmount;
    /**
     * 冻结状态
     * 冻结状态，详细见文档
     */
    @JsonProperty("status")
    private String status;
    /**
     * 付款方支付宝用户号
     * 付款方的支付宝用户号
     */
    @JsonProperty("payer_user_id")
    private String payerUserId;
    /**
     * 收款方支付宝账号
     * 收款方的支付宝账号(Email或者手机号)
     */
    @JsonProperty("payer_logon_id")
    private String payerLogonId;
    /**
     * 资金授权成功时间
     * 格式为yyyy-MM-dd HH:mm:ss，如2009年12月25日9点10分10秒表示为2009-12-25 09:10:10
     */
    @JsonProperty("fund_auth_time")
    private String fundAuthTime;
}
