CREATE TABLE "public"."order" (
    "id" UUID,
    "product_id" UUID,
    "customer_id" UUID,
    "shipping_address" text,
    "created_date" timestamp DEFAULT now(),
    "modified_date" timestamp DEFAULT now(),
    PRIMARY KEY ("id"),
    FOREIGN KEY ("product_id") REFERENCES "public"."product"("id") ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY ("customer_id") REFERENCES "public"."customer"("id") ON DELETE CASCADE ON UPDATE CASCADE
);