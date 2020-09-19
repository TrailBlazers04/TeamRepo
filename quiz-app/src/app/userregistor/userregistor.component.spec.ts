import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserregistorComponent } from './userregistor.component';

describe('UserregistorComponent', () => {
  let component: UserregistorComponent;
  let fixture: ComponentFixture<UserregistorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserregistorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserregistorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
