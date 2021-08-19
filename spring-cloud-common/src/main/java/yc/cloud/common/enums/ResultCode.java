package yc.cloud.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回码
 *
 * @author: yc
 * @date: 2021-07-07
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ResultCode {
    SUCCESS("00000", "请求成功"),

    /**
     * 用户模块
     */
    USER_CLIENT_ERROR("A0001", "用户端错误"),
    USER_REGISTERED_ERROR("A0100", "用户注册错误"),
    USER_USERNAME_CHECK_FAILED("A0110", "用户名校验失败"),
    USER_USERNAME_HAS_EXISTED("A0111", "用户名已存在"),
    USER_USERNAME_CONTAINS_SENSITIVE_WORDS("A0112", "用户名包含敏感词"),
    USER_USERNAME_CONTAINS_SPECIAL_CHARACTERS("A0113", "用户名包含特殊字符"),

    USER_PASSWORD_CHECK_FAILED("A0120", "密码校验失败"),
    USER_PASSWORD_LENGTH_NOT_ENOUGH("A0121", "密码长度不够"),
    USER_PASSWORD_WEAK("A0122", "密码强度不够"),

    USER_CHECK_CODE_INPUT_ERROR("A0130", "校验码输入错误"),
    USER_SMS_CODE_INPUT_ERROR("A0131", "短信校验码输入错误"),

    USER_CERTIFICATE_EXCEPTION("A0140", "用户证件异常"),
    USER_CERTIFICATE_TYPE_NOT_CHOOSE("A0141", "用户证件类型未选择" ),

    USER_BASIC_INFORMATION_FAILED("A0150", "用户基本信息校验失败"),
    USER_MOBILE_FORMAT_FAILED("A0151", "手机格式校验失败"),
    USER_ADDRESS_FORMAT_FAILED("A0152", "地址格式校验失败"),
    USER_EMAIL_FORMAT_FAILED("A0153", "邮箱格式校验失败"),

    USER_LOGIN_EXCEPTION("A0200", "用户登陆异常"),
    USER_ACCOUNT_NOT_EXIST("A0201", "用户账户不存在"),
    USER_ACCOUNT_FROZEN("A0202", "用户账户被冻结"),
    USER_ACCOUNT_HAS_INVALIDED("A0203", "用户账户已作废"),

    USER_PASSWORD_ERROR("A0210", "用户密码错误"),
    USER_PASSWORD_INPUT_OVER_LIMIT("A0211", "用户输入密码次数超限"),

    USER_IDENTITY_CHECK_FAILED("A0220", "用户身份校验失败"),
    USER_NOT_AUTHORIZED_BY_THIRD_PARTY("A0223", "用户未获得第三方登陆授权"),

    USER_LOGIN_EXPIRED("A0230", "用户登陆已过期"),

    USER_VERIFICATION_CODE_ERROR("A0240", "用户验证码错误"),
    USER_VERIFICATION_CODE_TRY_OVER_LIMIT("A0241", "用户验证码尝试次数超限"),

    USER_ACCESS_EXCEPTION("A0300", "访问权限异常"),
    USER_UNAUTHORIZED_ACCESS("A0301" , "访问未授权"),
    USER_AUTHORIZING("A0302", "正在授权中"),
    USER_AUTHORIZATION_EXPIRED("A0311", "授权已过期"),
    USER_UNAUTHORIZED_USE_API("A0312", "无权限使用 API"),

    USER_ACCESS_BLOCKED("A0320", "用户访问被拦截"),
    USER_STATUS_BLACK("A0321", "黑名单用户"),
    USER_REQUEST_IP_ILLEGAL("A0323", "非法 IP 地址"),
    USER_REGIONAL_BLACK("A0325", "地域黑名单"),

    USER_SIGNATURE_EXCEPTION("A0340", "用户签名异常"),
    USER_RSA_SIGNATURE_ERROR("A0341", "RSA 签名错误"),

    USER_REQUEST_PARAM_ERROR("A0400", "用户请求参数错误"),
    USER_INVALID_INPUT("A0402", "无效的用户输入"),

    USER_REQUEST_FILL_PARAM_EMPTY("A0410", "请求必填参数为空"),
    USER_ORDER_ID_EMPTY("A0411", "用户订单号为空"),
    USER_ORDER_QUANTITY_EMPTY("A0412", "订购数量为空"),
    USER_REQUEST_PARAM_TIMESTAMP_MISSING("A0413", "缺少时间戳参数"),
    USER_REQUEST_PARAM_TIMESTAMP_ILLEGAL("A0414", "非法的时间戳参数"),

    USER_REQUEST_PARAM_OVER_LIMIT("A0420", "请求参数值超出允许的范围"),
    USER_REQUEST_PARAM_NOT_MATCH("A0421", "参数格式不匹配"),
    USER_REQUEST_PARAM_AMOUNT_OVER_LIMIT("A0424", "金额超出限制"),
    USER_REQUEST_PARAM_NUMBER_OVER_LIMIT("A0425", "数量超出限制"),
    USER_REQUEST_BATCH_NUMBER_OVER_LIMIT("A0426", "请求批量处理总个数超出限制"),
    USER_REQUEST_JSON_PARSE_FAILED("A0427", "请求 JSON 解析失败"),

    USER_ACTION_EXCEPTION("A0440", "用户操作异常"),
    USER_PAYMENT_TIMEOUT("A0441", "用户支付超时"),
    USER_ORDER_TIMEOUT("A0442", "确认订单超时"),
    USER_ORDER_CLOSED("A0443", "确认订单已关闭"),

    USER_REQUEST_SERVER_EXCEPTION("A0500", "用户请求服务异常"),
    USER_REQUEST_TIMES_OVER_LIMIT("A0501", "请求次数超出限制"),
    USER_WEB_SOCKET_CONNECT_EXCEPTION("A0504", "WebSocket 连接异常"),
    USER_WEB_SOCKET_CONNECT_BROKE("A0505", "WebSocket 连接断开"),
    USER_REQUEST_REPEATABLE("A0506", "用户重复请求"),

    USER_RESOURCE_EXCEPTION("A0600", "用户资源异常"),
    USER_ACCOUNT_BALANCE_INSUFFICIENT("A0601", "账户余额不足"),

    USER_UPLOAD_FILE_EXCEPTION("A0700", "用户上传文件异常"),
    USER_UPLOAD_FILE_TYPE_NOT_MATCH("A0701", "用户上传文件类型不匹配"),
    USER_UPLOAD_FILE_LARGE("A0702", "用户上传文件太大"),
    USER_UPDATE_PIC_LARGE("A0703", "用户上传图片太大"),
    USER_UPDATE_VIDEO_LARGE("A0704", "用户上传视频太大"),
    USER_UPLOAD_COMPRESSED_FILE_LARGE("A0705", "用户上传压缩文件太大"),

    /**
     * 系统模块
     */
    BIZ_SYSTEM_EXECUTE_ERROR("B0001", "系统执行出错"),
    BIZ_SYSTEM_EXECUTE_TIMEOUT("B0100", "系统执行超时"),
    BIZ_SYSTEM_ORDER_PROCESS_TIMEOUT("B0101", "系统订单处理超时"),

    BIZ_SYSTEM_CURRENT_LIMITING("B0210", "系统限流"),
    BIZ_SYSTEM_THREAD_POOL_EXHAUSTED("B0315", "系统线程池耗尽"),
    BIZ_SYSTEM_RESOURCE_ACCESS_EXCEPTION("B0320", "系统资源访问异常"),

    /**
     * 三方服务模块
     */
    THIRD_PARTY_CALL_ERROR("C0001", "调用第三方服务出错"),
    THIRD_PARTY_MIDDLEWARE_SERVICE_ERROR("C0100", "中间件服务出错"),
    THIRD_PARTY_RPC_SERVICE_ERROR("C0110", "RPC 服务出错"),
    THIRD_PARTY_RPC_SERVICE_NOT_FOUND("C0111", "RPC 服务未找到"),
    THIRD_PARTY_PRC_SERVICE_NOT_REGISTERED("C0112", "RPC 服务未注册"),
    THIRD_PARTY_INTERFACE_NOT_EXIST("C0113", "接口不存在"),

    THIRD_PARTY_MESSAGE_SERVICE_ERROR("C0120", "消息服务出错"),
    THIRD_PARTY_MESSAGE_SEND_ERROR("C0121", "消息投递出错"),
    THIRD_PARTY_MESSAGE_CONSUME_ERROR("C0122", "消息消费出错"),
    THIRD_PARTY_MESSAGE_SUBSCRIBE_ERROR("C0123", "消息订阅出错"),

    THIRD_PARTY_CACHE_SERVICE_ERROR("C0130", "缓存服务出错"),
    THIRD_PARTY_KEY_LENGTH_OVER_LIMIT("C0131", "key 长度超过限制"),
    THIRD_PARTY_VALUE_LENGTH_OVER_LIMIT("C0132", "value 长度超过限制"),

    ;

    private String code;
    private String message;
}
