package com.study.spring2.case02;
public class Paper {
	private Integer id;
	private Color color;
	private Size size;
//	public Paper() {
//		super();
//		// TODO Auto-generated constructor stub
//	}	
	
	public Paper(Integer id, Color color, Size size) {
		super();
		this.id = id;
		this.color = color;
		this.size = size;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Paper [id=" + id + ", color=" + color + ", size=" + size + "]";
	}		
}
