// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class nether_missile_new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "nether_missile_new"), "main");
	private final ModelPart all;

	public nether_missile_new(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(46, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(101, 40).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -28.0F, 0.0F));

		PartDefinition hexadecagon_r1 = tube.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(85, 0).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(23, 37).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = tube.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(101, 80).addBox(-8.0F, -18.0F, -1.5913F, 16.0F, 36.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(62, 53).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = tube.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = tube.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 74).addBox(-1.5913F, -18.0F, -8.0F, 3.1826F, 36.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Connector = tube.addOrReplaceChild("Connector", CubeListBuilder.create().texOffs(39, 109).addBox(-0.675F, -5.5F, -1.5F, 1.25F, 5.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.5F, 0.0F));

		PartDefinition cube_r1 = Connector.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(69, 106).addBox(-0.675F, -5.5F, -1.5F, 1.25F, 5.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = Connector.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 0).addBox(-0.675F, -5.5F, -1.5F, 1.25F, 5.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r3 = Connector.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 6).addBox(-0.675F, -5.5F, -1.5F, 1.25F, 5.5F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone2 = tube.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(99, 120).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 1.9635F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 96).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 106).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 109).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(69, 109).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(84, 112).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.9635F, 0.0F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 119).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Bace = all.addOrReplaceChild("Bace", CubeListBuilder.create(), PartPose.offset(0.0F, -28.0F, 0.0F));

		PartDefinition OuterBace = Bace.addOrReplaceChild("OuterBace", CubeListBuilder.create().texOffs(86, 137).addBox(-1.5913F, 15.0F, 6.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(133, 131).addBox(-1.5913F, 15.0F, -8.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(106, 133).addBox(6.0F, 15.0F, -1.5913F, 2.0F, 3.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-8.0F, 15.0F, -1.5913F, 2.0F, 3.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition hexadecagon_r5 = OuterBace.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(62, 62).addBox(-8.0F, 15.0F, -1.5913F, 2.0F, 3.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(48, 122).addBox(6.0F, 15.0F, -1.5913F, 2.0F, 3.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(69, 122).addBox(-1.5913F, 15.0F, -8.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(75, 137).addBox(-1.5913F, 15.0F, 6.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = OuterBace.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(69, 9).addBox(6.0F, 15.0F, -1.5913F, 2.0F, 3.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(133, 124).addBox(-8.0F, 15.0F, -1.5913F, 2.0F, 3.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(36, 134).addBox(-1.5913F, 15.0F, -8.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 137).addBox(-1.5913F, 15.0F, 6.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r7 = OuterBace.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(48, 90).addBox(-1.5913F, 15.0F, -8.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(137, 36).addBox(-1.5913F, 15.0F, 6.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r8 = OuterBace.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(117, 136).addBox(-1.5913F, 15.0F, -8.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 139).addBox(-1.5913F, 15.0F, 6.0F, 3.1826F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition supports = Bace.addOrReplaceChild("supports", CubeListBuilder.create().texOffs(139, 137).addBox(-1.0F, 25.5F, -6.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(22, 139).addBox(-1.0F, 25.5F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = supports.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(137, 77).addBox(3.275F, -1.0F, 3.025F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(11, 139).addBox(3.275F, -1.0F, -5.975F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 26.5F, -4.25F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Middle = Bace.addOrReplaceChild("Middle", CubeListBuilder.create().texOffs(38, 0).addBox(-1.025F, 25.5F, -2.975F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Middle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 53).addBox(-0.5F, -1.0F, -3.075F, 1.0F, 2.0F, 6.175F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0302F, 26.5F, 0.0419F, -3.1416F, -0.4887F, 3.1416F));

		PartDefinition cube_r13 = Middle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -1.0F, -3.0875F, 1.0F, 2.0F, 6.175F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.036F, 26.5F, 0.0309F, -3.1416F, -0.8116F, 3.1416F));

		PartDefinition cube_r14 = Middle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -3.0875F, 1.0F, 2.0F, 6.175F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.036F, 26.5F, 0.0309F, -3.1416F, -1.0734F, 3.1416F));

		PartDefinition cube_r15 = Middle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -1.0F, -3.075F, 1.0F, 2.0F, 6.175F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 26.5F, 0.025F, 0.0F, -1.0821F, 0.0F));

		PartDefinition cube_r16 = Middle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.0F, -3.0875F, 1.0F, 2.0F, 6.175F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.036F, 26.5F, 0.0309F, 0.0F, -0.7592F, 0.0F));

		PartDefinition cube_r17 = Middle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, -1.0F, -3.0875F, 1.0F, 2.0F, 6.175F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.036F, 26.5F, 0.0309F, 0.0F, -0.4974F, 0.0F));

		PartDefinition cube_r18 = Middle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 26.5F, 0.025F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Tip = all.addOrReplaceChild("Tip", CubeListBuilder.create(), PartPose.offset(0.0F, -46.0F, 0.0F));

		PartDefinition Bottom = Tip.addOrReplaceChild("Bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = Bottom.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 132).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 133).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone3 = Bottom.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 129).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 132).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone4 = Bottom.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 127).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(27, 127).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone5 = Bottom.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.1781F, 0.0F));

		PartDefinition cube_r25 = bone5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 127).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r26 = bone5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(9, 127).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone7 = Bottom.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.9635F, 0.0F));

		PartDefinition cube_r27 = bone7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(39, 122).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r28 = bone7.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(124, 124).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone8 = Bottom.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r29 = bone8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(39, 90).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r30 = bone8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(84, 106).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone6 = Bottom.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r31 = bone6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(79, 125).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r32 = bone6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(88, 125).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone11 = Bottom.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r33 = bone11.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(85, 40).addBox(-0.5F, -5.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9837F, -1.5098F, 0.0F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r34 = bone11.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(85, 52).addBox(-0.5F, -3.75F, -1.5913F, 1.0F, 7.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3657F, -3.412F, 0.0F, 0.0F, 0.0F, 0.3142F));

		PartDefinition sepperator = Tip.addOrReplaceChild("sepperator", CubeListBuilder.create().texOffs(124, 0).addBox(-5.5F, -0.5F, -1.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.5F, 0.0F));

		PartDefinition cube_r35 = sepperator.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(124, 16).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.3491F, 3.1416F));

		PartDefinition cube_r36 = sepperator.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(124, 12).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.6458F, 3.1416F));

		PartDefinition cube_r37 = sepperator.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(124, 8).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.9425F, 3.1416F));

		PartDefinition cube_r38 = sepperator.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(124, 4).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 1.2392F, 3.1416F));

		PartDefinition cube_r39 = sepperator.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(124, 32).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -1.2217F, 3.1416F));

		PartDefinition cube_r40 = sepperator.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(124, 28).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.925F, 3.1416F));

		PartDefinition cube_r41 = sepperator.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(124, 24).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.6283F, 3.1416F));

		PartDefinition cube_r42 = sepperator.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(124, 20).addBox(-5.5F, -0.5F, -0.75F, 11.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.3316F, 3.1416F));

		PartDefinition cube_r43 = sepperator.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(114, 120).addBox(-5.5F, -0.5F, -1.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition top = Tip.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r44 = top.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(39, 22).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2279F, 3.4754F, 1.5708F, -0.9163F, -1.5708F));

		PartDefinition cube_r45 = top.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(39, 13).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2279F, -3.4754F, -1.5708F, -0.9163F, 1.5708F));

		PartDefinition cube_r46 = top.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 96).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3825F, -2.2279F, 0.8362F, 2.9463F, -0.2477F, -2.4627F));

		PartDefinition cube_r47 = top.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 58).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.228F, -2.2279F, -1.3117F, -2.9463F, -0.2477F, 2.4627F));

		PartDefinition cube_r48 = top.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 140).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9745F, -2.2279F, 1.8146F, 2.7319F, -0.4788F, -2.3858F));

		PartDefinition cube_r49 = top.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 140).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6842F, -2.2279F, -2.2217F, -2.7319F, -0.4788F, 2.3858F));

		PartDefinition cube_r50 = top.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(140, 51).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2912F, -2.2279F, 2.6251F, 2.4621F, -0.6862F, -2.2359F));

		PartDefinition cube_r51 = top.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(140, 42).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8919F, -2.2279F, -2.926F, -2.4621F, -0.6862F, 2.2359F));

		PartDefinition cube_r52 = top.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(140, 83).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3958F, -2.2279F, 3.1926F, 2.0977F, -0.8448F, -1.9811F));

		PartDefinition cube_r53 = top.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(140, 60).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9244F, -2.2279F, -3.3595F, -2.0977F, -0.8448F, 1.9811F));

		PartDefinition cube_r54 = top.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(140, 101).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8657F, -2.2279F, 3.3751F, 1.0682F, -0.8516F, -1.1787F));

		PartDefinition cube_r55 = top.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(140, 92).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3398F, -2.2279F, -3.2165F, -1.0682F, -0.8516F, 1.1787F));

		PartDefinition cube_r56 = top.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(140, 110).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8146F, -2.2279F, 2.9745F, 0.7065F, -0.7022F, -0.923F));

		PartDefinition cube_r57 = top.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(106, 140).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2217F, -2.2279F, -2.6842F, -0.7065F, -0.7022F, 0.923F));

		PartDefinition cube_r58 = top.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(113, 142).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.605F, -2.2279F, 2.314F, 0.437F, -0.504F, -0.7687F));

		PartDefinition cube_r59 = top.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(47, 141).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9094F, -2.2279F, -1.9173F, -0.437F, -0.504F, 0.7687F));

		PartDefinition cube_r60 = top.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 143).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1803F, -2.2279F, 1.4236F, 0.218F, -0.2748F, -0.6848F));

		PartDefinition cube_r61 = top.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(120, 142).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3513F, -2.2279F, -0.9537F, -0.218F, -0.2748F, 0.6848F));

		PartDefinition cube_r62 = top.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 49).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4754F, -2.2279F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r63 = top.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 40).addBox(-0.25F, -3.0F, -1.0F, 0.5F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4754F, -2.2279F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition bone9 = top.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(12, 68).addBox(-1.0F, -1.0F, -1.7125F, 2.0F, 2.0F, 3.425F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, -0.0125F));

		PartDefinition cube_r64 = bone9.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(9, 62).addBox(-1.0F, -1.0F, -1.7125F, 2.0F, 2.0F, 3.425F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone10 = top.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, -1.0F, -1.7125F, 2.0F, 2.0F, 3.425F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -0.0125F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r65 = bone10.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(11, 53).addBox(-1.0F, -1.0F, -1.7125F, 2.0F, 2.0F, 3.425F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

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