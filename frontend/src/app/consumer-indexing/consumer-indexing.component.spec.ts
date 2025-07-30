import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsumerIndexingComponent } from './consumer-indexing.component';

describe('ConsumerIndexingComponent', () => {
  let component: ConsumerIndexingComponent;
  let fixture: ComponentFixture<ConsumerIndexingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ConsumerIndexingComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConsumerIndexingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
