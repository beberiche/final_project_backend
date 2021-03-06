package com.ssafit.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.model.dto.Video;
import com.ssafit.model.service.CommentService;
import com.ssafit.model.service.VideoService;

@RestController
@RequestMapping("/api/video")
public class VideoController {
	@Autowired
	VideoService videoService;

	@Autowired
	CommentService commentService;

	// 비디오 조회
	@GetMapping("/list")
	public ResponseEntity<List<Video>> videoList(@RequestParam(defaultValue = "") String mode,
			@RequestParam(defaultValue = "") String key) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("mode", mode);
		map.put("key", key);
		return new ResponseEntity<List<Video>>(videoService.selecList(map), HttpStatus.OK);

	}

	// 비디오 상세
	@GetMapping("/{id}")
	public ResponseEntity<Video> videoDetail(@PathVariable String id) {
		
		return new ResponseEntity<Video>(videoService.selectOne(id), HttpStatus.OK);
	}
}
