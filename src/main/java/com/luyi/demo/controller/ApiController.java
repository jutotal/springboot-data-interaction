package com.luyi.demo.controller;

/**
 * Create by 肖橙橙
 * Date: 2020:08:03  00:39
 */
public class ApiController {
    /**
     * 🐺返回方式：
     * 1.类注解 @RestController
     * 2.方法注解 @ResponseBody
     *
     * 🐺请求方式
     * 1.@RequestMapping
     *   在RequestMapping的源码中提到，这种支持任意请求方式
     * 2.@GetMapping
     *   客户端只能用 GET 方式请求，适用于查询数据
     * 3.@PostMapping
     *   客户端只能用 POST方式请求，适用于提交数据。
     * 4.@DeleteMapping
     *   客户端只能用 DELETE方式请求，使用于删除数据。
     * 5.@PutMapping
     *   客户端只能用 PUT方式请求，使用于修改数据（但在实际使用中，个人建议还是采用POST方式较为妥当）。
     * ******************  关于请求方式及使用范围，可以参考 RESTful API ******************
     *
     * 🐺接收参数
     * 1.@RequestParam
     *   public String getInfo(@RequestParam(name = "param",
     *                                         required = false,
     *                                         defaultValue = "param dafault value") String param)
     *   name代表提交参数名。
     *   required意思是这个参数是否必需，默认true，没有该参数，无法调用此方法；这里设为false，有无该参数都可以调用。
     *   defaultValue如果该参数值为空，那么就使用默认值。
     * 2.@PathVariable
     *    @RequestMapping("/get-info/{param}")
     *    public String getInfo(@PathVariable("param") Object param)
     *    URL省去了 ？参数名= 。 例如：https://localhost:8080/get-info
     *    这种一般配合 @DeleteMapping、@PutMapping使用。
     * 3.@RequestHeader
     *   获取提交数据的 Headers 的值。我是用来接收 TOKEN
     *
     *🐺 数据格式
     * 1.int、String等常用的数据类型
     * 2.日常使用的Map、List、Array
     */
}
