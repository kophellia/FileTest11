package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.BoardDTO;
import com.example.demo.dto.BoardFileDTO;

public interface BoardService {
	List<BoardDTO> findBoardList();
	void registerBoard( BoardDTO dto ) throws Exception ; 
	void registerBoardFileList(List<BoardFileDTO> list) throws Exception ; 
	BoardDTO findBoardDetail(int boardIdx);
	BoardFileDTO findBoardFileDetail(int idx);
}