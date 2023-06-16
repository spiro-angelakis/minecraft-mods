// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class terrier_downward<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "terrier_downward"), "main");
	private final ModelPart all;

	public terrier_downward(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create().texOffs(42, 0).addBox(-8.7956F, -33.0F, 4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(63, 0).addBox(-12.0F, -33.0F, 7.2044F, 8.0F, 41.0F, 1.5913F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -8.0F, -8.0F));

		PartDefinition hexadecagon_r1 = body.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(42, 50).addBox(-4.0F, -33.0F, -0.7956F, 8.0F, 41.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(21, 0).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = body.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(63, 44).addBox(-4.0F, -33.0F, -0.7956F, 8.0F, 41.0F, 1.5913F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = body.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = body.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(21, 50).addBox(-0.7956F, -33.0F, -4.0F, 1.5913F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 8.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Tip = all.addOrReplaceChild("Tip", CubeListBuilder.create().texOffs(84, 39).addBox(-1.0F, -42.5F, -1.0F, 2.0F, 9.5F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r1 = Tip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 0).addBox(-1.0F, -4.75F, -1.0F, 2.0F, 9.5F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 13).addBox(-1.0F, -4.75F, -1.0F, 2.0F, 9.5F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -37.75F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = Tip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(84, 26).addBox(-1.0F, -4.75F, -1.0F, 2.0F, 9.5F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -37.75F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition Cone = Tip.addOrReplaceChild("Cone", CubeListBuilder.create(), PartPose.offset(0.0F, -34.0F, 0.0F));

		PartDefinition cube_r3 = Cone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 88).addBox(-0.7956F, -4.25F, -0.5F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5923F, -3.5204F, 1.6338F, 0.2618F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = Cone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 88).addBox(-0.8457F, -7.0F, 0.025F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.531F, -1.0F, -2.4188F, -0.2618F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = Cone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 74).addBox(-0.7957F, -4.25F, -0.5F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2811F, -3.5204F, 0.0293F, 0.0F, -1.5708F, 0.2618F));

		PartDefinition cube_r6 = Cone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(84, 85).addBox(-0.8457F, -7.0F, 0.025F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.0F, 0.0793F, 0.0F, -1.5708F, -0.2618F));

		PartDefinition cube_r7 = Cone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(84, 52).addBox(-0.7957F, -4.25F, -0.5F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6338F, -3.5204F, -1.5923F, -2.8798F, -0.7854F, 3.1416F));

		PartDefinition cube_r8 = Cone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(84, 63).addBox(-0.8457F, -7.0F, 0.025F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4188F, -1.0F, 2.531F, 2.8798F, -0.7854F, 3.1416F));

		PartDefinition cube_r9 = Cone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 88).addBox(-0.7956F, -4.25F, -0.5F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0293F, -3.5204F, 2.2811F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Cone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(91, 52).addBox(-0.8457F, -7.0F, 0.025F, 1.5913F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0793F, -1.0F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Thruster = all.addOrReplaceChild("Thruster", CubeListBuilder.create().texOffs(13, 0).addBox(-9.5F, 7.5F, 6.5F, 3.0F, 2.25F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 0).addBox(-10.375F, 7.5F, 6.5F, 0.875F, 2.125F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 89).addBox(-6.5F, 7.5F, 6.5F, 0.875F, 2.125F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -8.0F, -8.0F));

		PartDefinition bone = Thruster.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(91, 77).addBox(1.5F, -1.0625F, -1.5F, 0.875F, 2.125F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 83).addBox(-2.375F, -1.0625F, -1.5F, 0.875F, 2.125F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 8.5625F, 8.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Thruster2 = Thruster.addOrReplaceChild("Thruster2", CubeListBuilder.create(), PartPose.offset(-8.0F, 8.8538F, 8.0F));

		PartDefinition cube_r11 = Thruster2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(91, 63).addBox(-1.375F, -0.625F, -1.5F, 1.0F, 2.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.1038F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r12 = Thruster2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(91, 70).addBox(-0.5F, -1.25F, -1.5F, 1.0F, 2.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4297F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Thruster3 = Thruster.addOrReplaceChild("Thruster3", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 8.8538F, 8.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = Thruster3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 0).addBox(-1.375F, -0.625F, -1.5F, 1.0F, 2.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.1038F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r14 = Thruster3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 50).addBox(-0.5F, -1.25F, -1.5F, 1.0F, 2.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4297F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition BottomFins = all.addOrReplaceChild("BottomFins", CubeListBuilder.create(), PartPose.offset(-4.625F, -5.9375F, 0.0F));

		PartDefinition Fin2 = BottomFins.addOrReplaceChild("Fin2", CubeListBuilder.create().texOffs(0, 50).addBox(-0.625F, 1.4375F, 0.0F, 3.0F, 4.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 16).addBox(-0.625F, -0.5625F, 0.0F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 37).addBox(-0.625F, -2.0625F, 0.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(57, 94).addBox(-0.625F, -3.5625F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(9.25F, 0.0F, 0.0F));

		PartDefinition Fin = BottomFins.addOrReplaceChild("Fin", CubeListBuilder.create().texOffs(22, 50).addBox(-2.375F, 1.4375F, 0.0F, 3.0F, 4.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 19).addBox(-1.875F, -0.5625F, 0.0F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 40).addBox(-1.375F, -2.0625F, 0.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(91, 95).addBox(-0.875F, -3.5625F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Fin4 = BottomFins.addOrReplaceChild("Fin4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.625F, 1.4375F, 0.0F, 3.0F, 4.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(55, 5).addBox(-0.625F, -0.5625F, 0.0F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 31).addBox(-0.625F, -2.0625F, 0.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(47, 94).addBox(-0.625F, -3.5625F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.625F, 0.0F, 4.625F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Fin3 = BottomFins.addOrReplaceChild("Fin3", CubeListBuilder.create().texOffs(43, 0).addBox(-15.0F, 3.5F, 8.0F, 3.0F, 4.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(34, 55).addBox(-14.5F, 1.5F, 8.0F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 34).addBox(-14.0F, 0.0F, 8.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(52, 94).addBox(-13.5F, -1.5F, 8.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.625F, -2.0625F, 8.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition BottomFins2 = all.addOrReplaceChild("BottomFins2", CubeListBuilder.create(), PartPose.offset(-4.625F, -35.9375F, 0.0F));

		PartDefinition Fin5 = BottomFins2.addOrReplaceChild("Fin5", CubeListBuilder.create().texOffs(93, 11).addBox(-0.625F, -0.5625F, 0.0F, 2.5F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 28).addBox(-0.625F, -2.0625F, 0.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(42, 94).addBox(-0.625F, -3.5625F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(9.25F, 0.0F, 0.0F));

		PartDefinition Fin6 = BottomFins2.addOrReplaceChild("Fin6", CubeListBuilder.create().texOffs(93, 6).addBox(-1.875F, -0.5625F, 0.0F, 2.5F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 25).addBox(-1.375F, -2.0625F, 0.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 49).addBox(-0.875F, -3.5625F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Fin7 = BottomFins2.addOrReplaceChild("Fin7", CubeListBuilder.create().texOffs(55, 0).addBox(-0.625F, -0.5625F, 0.0F, 2.5F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 22).addBox(-0.625F, -2.0625F, 0.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 46).addBox(-0.625F, -3.5625F, 0.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.625F, 0.0F, 4.625F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Fin8 = BottomFins2.addOrReplaceChild("Fin8", CubeListBuilder.create().texOffs(34, 50).addBox(-14.5F, 1.5F, 8.0F, 2.5F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(23, 0).addBox(-14.0F, 0.0F, 8.0F, 2.0F, 1.5F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 43).addBox(-13.5F, -1.5F, 8.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.625F, -2.0625F, 8.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}