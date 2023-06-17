// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class emp_new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "emp_new"), "main");
	private final ModelPart all;

	public emp_new(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition bone5 = all.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, -62.5F, 0.25F));

		PartDefinition TopOutter = bone5.addOrReplaceChild("TopOutter", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, 0.0F));

		PartDefinition bone2 = TopOutter.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(137, 55).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(137, 46).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(202, 87).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(91, 202).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 202).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(202, 147).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(117, 203).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(130, 203).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(143, 203).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(182, 203).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(200, 203).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(204, 0).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(204, 28).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(204, 193).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(205, 14).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(205, 38).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(205, 60).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(0, 206).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone6 = TopOutter.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(124, 46).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(124, 32).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, -1.5708F, 0.3927F, 0.0F));

		PartDefinition cube_r10 = bone6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 179).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(26, 179).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r11 = bone6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(156, 179).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(180, 92).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r12 = bone6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(180, 101).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(169, 180).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r13 = bone6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 181).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(52, 181).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r14 = bone6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(65, 181).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(182, 37).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r15 = bone6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 184).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(91, 184).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r16 = bone6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(104, 184).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r17 = bone6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(184, 111).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r18 = bone6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(184, 120).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(184, 138).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone8 = TopOutter.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(124, 23).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(117, 121).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, -1.5708F, 1.1781F, 0.0F));

		PartDefinition cube_r19 = bone8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(171, 124).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(171, 138).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(171, 147).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(39, 172).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r21 = bone8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 172).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(65, 172).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r22 = bone8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(78, 175).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(91, 175).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r23 = bone8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(104, 175).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(117, 176).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r24 = bone8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(130, 176).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(143, 176).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(178, 0).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r26 = bone8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(178, 9).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r27 = bone8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(178, 175).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(0, 179).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone9 = TopOutter.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(117, 5).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, 1.5708F, 1.1781F, 3.1416F));

		PartDefinition cube_r28 = bone9.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(117, 153).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(0, 161).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(13, 161).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(26, 161).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(167, 92).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(167, 101).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r31 = bone9.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(117, 167).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(130, 167).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r32 = bone9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(143, 167).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(169, 37).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r33 = bone9.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 170).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(13, 170).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r34 = bone9.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(26, 170).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r35 = bone9.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(156, 170).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r36 = bone9.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(169, 170).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(171, 115).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone10 = TopOutter.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(83, 7).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(0, 74).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, 1.5708F, 0.3927F, 3.1416F));

		PartDefinition cube_r37 = bone10.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(140, 69).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(140, 78).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r38 = bone10.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(140, 92).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(140, 101).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r39 = bone10.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 143).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(13, 143).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r40 = bone10.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 143).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(144, 115).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r41 = bone10.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(117, 144).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(144, 124).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r42 = bone10.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(144, 144).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(151, 0).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r43 = bone10.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(151, 9).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r44 = bone10.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 152).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r45 = bone10.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(13, 152).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(26, 152).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone3 = TopOutter.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(26, 134).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(13, 134).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(196, 19).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(0, 197).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(13, 197).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(26, 197).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(197, 114).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(197, 138).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(156, 197).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(198, 123).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(191, 198).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(39, 199).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(52, 199).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(65, 199).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(169, 199).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(200, 170).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(200, 184).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(78, 202).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone4 = TopOutter.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 134).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(117, 130).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, -0.7854F, 0.0F, 1.5708F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(65, 190).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(191, 0).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(191, 179).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(191, 189).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(78, 193).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(91, 193).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(193, 96).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(104, 193).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(193, 105).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(193, 152).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(117, 194).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(130, 194).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(143, 194).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(178, 194).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(195, 33).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(196, 9).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone7 = TopOutter.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(126, 0).addBox(8.4101F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(124, 55).addBox(-9.9649F, -1.75F, -1.7634F, 1.625F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0899F, -1.75F, -0.2366F, 0.7854F, 0.0F, 1.5708F));

		PartDefinition cube_r64 = bone7.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(184, 147).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(182, 184).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r65 = bone7.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(117, 185).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(130, 185).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r66 = bone7.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(143, 185).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(187, 14).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r67 = bone7.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(187, 170).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(0, 188).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r68 = bone7.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(13, 188).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(26, 188).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r69 = bone7.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(156, 188).addBox(8.5F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(189, 87).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r70 = bone7.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(189, 129).addBox(17.75F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0903F, 0.0F, -5.9441F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r71 = bone7.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(169, 189).addBox(-10.0F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.0F, 0.0017F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r72 = bone7.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(39, 190).addBox(-10.0F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(52, 190).addBox(8.5F, -3.5F, -2.0F, 1.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0899F, 1.75F, 0.2366F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cusp2 = bone5.addOrReplaceChild("cusp2", CubeListBuilder.create().texOffs(124, 23).addBox(-9.7902F, -10.0F, -1.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(162, 161).addBox(-17.0F, -10.0F, 6.2098F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 12.5F, -8.25F));

		PartDefinition hexadecagon_r1 = cusp2.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(151, 28).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(124, 0).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = cusp2.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(164, 46).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(137, 46).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = cusp2.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(117, 121).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = cusp2.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(140, 69).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Body = all.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(62, 51).addBox(-9.5913F, -33.0F, 0.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(39, 118).addBox(-16.0F, -33.0F, 6.4087F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -24.0F, -8.0F));

		PartDefinition hexadecagon_r5 = Body.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(101, 67).addBox(-8.0F, -25.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(39, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = Body.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(78, 121).addBox(-8.0F, -25.0F, -1.5913F, 16.0F, 50.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 67).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r7 = Body.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r8 = Body.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(85, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.1826F, 50.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Thruster = all.addOrReplaceChild("Thruster", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cusp = Thruster.addOrReplaceChild("cusp", CubeListBuilder.create().texOffs(117, 144).addBox(-9.7902F, -10.0F, -1.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(167, 69).addBox(-17.0F, -10.0F, 6.2098F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 3.0F, -8.0F));

		PartDefinition hexadecagon_r9 = cusp.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(164, 55).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(144, 115).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r10 = cusp.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(167, 78).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.5804F, new CubeDeformation(0.0F))
		.texOffs(144, 138).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r11 = cusp.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(140, 92).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r12 = cusp.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(151, 5).addBox(-1.7902F, -2.0F, -9.0F, 3.5804F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition barrel = Thruster.addOrReplaceChild("barrel", CubeListBuilder.create().texOffs(23, 67).addBox(-8.7956F, -10.0F, 4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(39, 98).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 7.0F, -8.0F));

		PartDefinition hexadecagon_r13 = barrel.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(75, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(62, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r14 = barrel.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(39, 105).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(39, 72).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r15 = barrel.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(23, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r16 = barrel.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(39, 85).addBox(-0.7956F, -2.0F, -4.0F, 1.5913F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Flaps = Thruster.addOrReplaceChild("Flaps", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition flap1 = Flaps.addOrReplaceChild("flap1", CubeListBuilder.create().texOffs(0, 67).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition flap2 = Flaps.addOrReplaceChild("flap2", CubeListBuilder.create().texOffs(36, 0).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8362F, -1.4835F, 3.1416F));

		PartDefinition flap4 = Flaps.addOrReplaceChild("flap4", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 1.4835F, 0.0F));

		PartDefinition flap3 = Flaps.addOrReplaceChild("flap3", CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8362F, 0.0873F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}