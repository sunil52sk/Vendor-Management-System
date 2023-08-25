package com.example.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.springapp.model.VendorsModel;
import com.example.springapp.service.VendorService;

@RestController
public class VendorsController {
	@Autowired
	VendorService sser;
	@PostMapping("addvendors")
	public VendorsModel add(@RequestBody VendorsModel ss) {
		return sser.addinfo(ss);
	}
	@PostMapping("addnvendors")
	public List<VendorsModel> add1(@RequestBody List<VendorsModel> ss) {
		return sser.addninfo(ss);
	}
	@GetMapping("showvendors")
	public List<VendorsModel> show() {
		return sser.retriveinfo();
	}
	@PutMapping("update")
	public VendorsModel modify(@RequestBody VendorsModel ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("erase")
	public String  del(@RequestBody VendorsModel ss) {
		sser.deleteinfo(ss);
		return "Deleted sucessfully";
	}
	@DeleteMapping("erase/{vendorId}")
	public String del1(@PathVariable int vendorId) {
		sser.deleteinfobyid(vendorId);
		return "Deleted Sucessfully";
	}
	@DeleteMapping("eraseparams")
	public String del2(@RequestParam int vendorId) {
		sser.deleteinfobyparams(vendorId);
		return "Deleted Sucessfully";
	}
	@GetMapping("getbyid/{VendorId}")
	public Optional<VendorsModel> showbyid(@PathVariable int  vendorId) {
		return sser.retrivebyid(vendorId);
	}
	@PutMapping("updatebyid/{vendorId}")
	public String modifybyid(@RequestBody VendorsModel v,@PathVariable int vendorId) {
		return sser.changebyid(v, vendorId);
	}
	@GetMapping("sort/{field}")
	public List<VendorsModel>  sortme(@PathVariable String field){
		return sser.sortinfo(field);
	}
	@GetMapping("paging/{pageno}/{pagesize}/field{}")
	public List<VendorsModel> displaybypage(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String  field){
		return sser.pagingtheinfo(pageno, pagesize,field);
	}
}
