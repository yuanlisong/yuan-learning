package com.yuanlisong.boot1.controller;

import com.yuanlisong.boot1.mbg.model.Bookshelf;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestOneController   
 * @ClassName TestOneController
 * @Description TODO
 * @author YuanLiSong 2021/11/4 15:46
 * @Copyright: YuanLiSong
 */
@Api(tags = "TestOneController", description = "测试管理")
@RestController
@RequestMapping("/test")
public class TestOneController {

	@ApiOperation("查询")
	@GetMapping("/queryOne")
	public String queryOne(@RequestParam("bookId") String bookId) {
		return "queryOne";
	}

	@ApiOperation("添加品牌")
	@PostMapping("/insertOne")
	public String insertOne(@RequestBody Bookshelf bookshelf) {
		return "insertOne";
	}

	@ApiOperation("修改品牌")
	@PostMapping("/updateOne/{bookId}")
	public String updateOne(@PathVariable("bookId") Long bookId, @RequestBody Bookshelf bookshelf) {
		return "updateOne";
	}

	@ApiOperation("删除品牌")
	@PostMapping("/deleteOne/{bookId}")
	public String deleteOne(@PathVariable("bookId") Long bookId) {
		return "deleteOne";
	}
}
