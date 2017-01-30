CREATE TABLE "public"."product" (
    "id" UUID DEFAULT uuid_generate_v1,
    "name" text,
    "company" text,
    "created_date" timestamp DEFAULT now(),
    "modified_date" timestamp DEFAULT now(),
    PRIMARY KEY ("id")
);