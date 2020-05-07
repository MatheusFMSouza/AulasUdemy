import { ProductService } from "./../product.service";
import { Component, OnInit } from "@angular/core";
import { Product } from "../product.model";

@Component({
  selector: "app-product-read",
  templateUrl: "./product-read.component.html",
  styleUrls: ["./product-read.component.css"],
})
export class ProductReadComponent implements OnInit {
  products: Product[];

  displayedColumns = ['id', 'name','price','action']

  constructor(private service: ProductService) {}

  ngOnInit(): void {
    this.service.read().subscribe((products) => {
      this.products = products;
      console.log(products);
    });
  }
}
